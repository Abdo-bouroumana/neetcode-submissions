class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int count = 0;
        Set<Character> seen = new HashSet<>();
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(seen.contains(s.charAt(j))){
                if(count > maxLength) maxLength = count;
                seen.remove(s.charAt(i));
                count--;
                i++;
            }else{
                seen.add(s.charAt(j));
                j++;
                count++;
            }
        }
        if(count > maxLength) maxLength = count;
        return maxLength;
    }
}
