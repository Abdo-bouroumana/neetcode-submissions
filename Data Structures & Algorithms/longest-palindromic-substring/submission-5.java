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
        int n = s.length();
        String longest = "";
        int maxCurrLength = 0;
        for(int i = 0; i < n; i++){
            if(n - i < maxCurrLength) break;
            for(int j = n; j > i; j--){
                if(j - i < maxCurrLength) break;
                String curr = s.substring(i, j);
                if(isPalindrome(curr)){
                    if(curr.length() > maxCurrLength) {
                        longest = curr;
                        maxCurrLength = curr.length();
                        break;
                    }
                }
            }
        }
        return longest;
        
        
    }
}
