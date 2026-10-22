class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        int maxLength = 0;
        int n = s.length();

        Set<Character> existSet = new HashSet<Character>();

        for(int i = 0; i < n; i++){
            
                while(existSet.contains(s.charAt(i))){
                    existSet.remove(s.charAt(startIndex));
                    startIndex++;
                }
                existSet.add(s.charAt(i));
                maxLength = (existSet.size()) > maxLength ? (existSet.size()) : maxLength; 
                
            
        }

        return maxLength;
    }
}
