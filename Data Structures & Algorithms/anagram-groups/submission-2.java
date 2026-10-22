class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagramGroups = new HashMap<>();
        for(String s : strs){
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String sortedS = new String(sChars);
            ArrayList<String> anagrams = anagramGroups.get(sortedS);
            if(anagrams != null){
                anagrams.add(s);
            }else{
                anagramGroups.put(sortedS, new ArrayList<>(List.of(s)));
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(ArrayList<String> group : anagramGroups.values()){
            result.add(group);
        }
        return result;
    }
}
