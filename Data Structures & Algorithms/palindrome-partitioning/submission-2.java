class Solution {
    public boolean isPalindrome(String word){
        int i = 0;
        int j = word.length() - 1;
        while(i < j){
            if(word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public void backtracking(String s, int start, List<List<String>> result, List<String> list){
        String cumulativeString = "";
        for(int i = start; i < s.length(); i++){
            cumulativeString += s.charAt(i);
            if(!isPalindrome(cumulativeString)) continue;
            list.add(cumulativeString);
            backtracking(s, i+1, result, list);
            if(i == s.length() - 1) result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
        }
    } 

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtracking(s, 0, result, new ArrayList<>());
        return result;
    }
}