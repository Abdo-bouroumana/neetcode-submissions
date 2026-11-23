class Solution {
    public void backtracking(String digits, int digitIndex, List<String> result, String combination, Map<Integer, String> phone){
        if(digitIndex == digits.length()){
            result.add(combination);
            return;
        }
        int digit = digits.charAt(digitIndex) - '0';
        for(int i = 0; i < phone.get(digit).length(); i++){
            char character = phone.get(digit).charAt(i);
            backtracking(digits, digitIndex + 1, result, combination + character, phone);
        }

    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        Map<Integer, String> phone = new HashMap<>();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int start = 0;
        for(int i = 2; i < 10; i++){
            if(i == 7 || i == 9){
                phone.put(i, alphabets.substring(start, start+4));
                start = start + 4;
            }else{
                phone.put(i, alphabets.substring(start, start+3));
                start = start + 3;
            }
        }
        List<String> result = new ArrayList<>();
        backtracking(digits, 0, result, "", phone);
        return result;
        
    }
}
