class Solution {
    public void backtracking(String parenthesis, int n, int open, List<String> result){
        if(n == 0 && open == 0){
            result.add(parenthesis);
            return;
        }
        if(n > 0) backtracking(parenthesis + "(", n - 1, open + 1, result);
        if(open > 0) backtracking(parenthesis + ")", n, open - 1, result);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking("", n, 0, result);
        return result;
    }
}
