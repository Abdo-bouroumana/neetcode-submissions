class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<char> rows_check;
        unordered_set<char> columns_check;
        unordered_set<char> squares_check;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.' && rows_check.find(board[i][j]) != rows_check.end()){
                    return false;
                }else{
                    rows_check.insert(board[i][j]);
                }
                if(board[j][i] != '.' && columns_check.find(board[j][i]) != columns_check.end()){
                    return false;
                }else{
                    columns_check.insert(board[j][i]);
                }

            }
            rows_check.clear();
            columns_check.clear();
        }

        for(int i = 0; i < 7; i += 3){
                for(int j = 0; j < 7; j += 3){
                    for(int k = 0; k < 3; k++){
                        for(int l = 0; l < 3; l++){
                            if(board[i + k][j + l] != '.' && squares_check.find(board[i + k][j + l]) != squares_check.end()){
                                return false;
                            }else{
                                squares_check.insert(board[i + k][j + l]);
                            }
                        }
                    }
                    squares_check.clear();
                }
            }
            return true;


        
    }
};
