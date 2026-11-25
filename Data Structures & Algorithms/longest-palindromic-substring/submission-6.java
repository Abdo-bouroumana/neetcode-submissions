class Solution {
    
    public String longestPalindrome(String s) {
        
        String result = "";
        int resLen = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            int l = i;
            int r = i;

            while(l >= 0 && r <= n - 1){
                if(s.charAt(l) != s.charAt(r)) break;
                if(r - l + 1 > resLen){
                    result = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while(l >= 0 && r <= n - 1){
                if(s.charAt(l) != s.charAt(r)) break;
                if(r - l + 1 > resLen){
                    result = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return result;
        
        
    }
}
