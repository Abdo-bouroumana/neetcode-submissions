class Solution {
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        List<String> palindromes = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            String curr = "";
            curr += s.charAt(i);
            palindromes.add(curr);
            for(int j = i+1; j < s.length(); j++ ){
                curr += s.charAt(j);
                if(isPalindrome(curr)) palindromes.add(curr);
            }
        }
        
        int index = 0;
        for(int i = 1; i < palindromes.size(); i++){
            if(palindromes.get(i).length() > palindromes.get(index).length()) index = i;
        }
        return palindromes.get(index);
    }
}
