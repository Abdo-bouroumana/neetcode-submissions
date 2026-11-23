class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        Map<Character, Integer> charactersFrequencyMap = new HashMap<>();
        int zeroCharacters = 0;
        for(int i = 0; i < s1.length(); i++){
            charactersFrequencyMap.merge(s1.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i < s1.length(); i++){
            Integer value = charactersFrequencyMap.get(s2.charAt(i));
            if(value != null){
                if(value == 0) zeroCharacters -= 1;
                charactersFrequencyMap.put(s2.charAt(i), value - 1);
                if(value - 1 == 0) zeroCharacters += 1;
            }
            if(zeroCharacters == charactersFrequencyMap.size()) return true;
        }

        int i = 1;
        int j = s1.length();

        while(j < s2.length()){
            Integer out = charactersFrequencyMap.get(s2.charAt(i - 1));
            
            if(out != null){
                if(out == 0) zeroCharacters -= 1;
                charactersFrequencyMap.put(s2.charAt(i - 1), out + 1);
                if(out + 1 == 0) zeroCharacters += 1;
            }
            Integer in = charactersFrequencyMap.get(s2.charAt(j));
            if(in != null){
                if(in == 0) zeroCharacters -= 1;
                charactersFrequencyMap.put(s2.charAt(j), in - 1);
                if(in - 1 == 0) zeroCharacters += 1;
            }
            if(zeroCharacters == charactersFrequencyMap.size()) return true;
            i++;
            j++;
        }
        return false;
        
    }
}
