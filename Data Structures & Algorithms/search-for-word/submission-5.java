class Solution {
    boolean found = false;

    public void backtracking(char[][] board, String word, int i, int j, int charIndex, boolean[][] used){
        if(i == -1 && j == -1){
            for(int k = 0; k < board.length; k++){
                for(int l = 0; l < board[0].length; l++){
                    if(board[k][l] == word.charAt(charIndex)){
                        if(charIndex == word.length() - 1) {
                            found = true;
                            return;
                        }
                        else {
                            used[k][l] = true;
                            backtracking(board, word, k, l, 1, used);
                            used[k][l] = false;
                        }
                    }
                }
            }
        }else{
            if(!found && i - 1 >= 0 && word.charAt(charIndex) == board[i - 1][j] && !used[i - 1][j]){
                if(charIndex == word.length() - 1) found = true;
                else {
                    used[i - 1][j] = true;
                    backtracking(board, word, i - 1, j, charIndex + 1, used);
                    used[i - 1][j] = false;
                }
            }
            if(!found && i + 1 < board.length && word.charAt(charIndex) == board[i + 1][j] && !used[i + 1][j]){
                if(charIndex == word.length() - 1) found = true;
                else {
                    used[i + 1][j] = true;
                    backtracking(board, word, i + 1, j, charIndex + 1, used);
                    used[i + 1][j] = false;
                }
            }
            if(!found && j - 1 >= 0 && word.charAt(charIndex) == board[i][j - 1] && !used[i][j - 1]){
                if(charIndex == word.length() - 1) found = true;
                else{
                    used[i][j - 1] = true;
                    backtracking(board, word, i, j - 1, charIndex + 1, used);
                    used[i][j - 1] = false;
                } 
            }
            if(!found && j + 1 < board[0].length && word.charAt(charIndex) == board[i][j + 1] && !used[i][j + 1]){
                if(charIndex == word.length() - 1) found = true;
                else{
                    used[i][j + 1] = true;
                    backtracking(board, word, i, j + 1, charIndex + 1, used);
                    used[i][j + 1] = false;
                } 
            }
        }
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];

        for (boolean[] row : used) {
            Arrays.fill(row, false);
        }
        backtracking(board, word, -1, -1, 0, used);
        return found;
    }
}
