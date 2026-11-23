class Solution {
    public boolean isValid(String s) {
        Deque<Character> sStack = new ArrayDeque<>();
        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        for(int i = 0; i < s.length(); i++){
            if(parenthesesMap.containsKey(s.charAt(i))){
                sStack.push(s.charAt(i));
            }else{
                if(sStack.isEmpty() || parenthesesMap.get(sStack.peek()) != s.charAt(i)) return false;
                else sStack.pop();
            }
        }
        if(sStack.isEmpty()) return true;
        else return false;
        
    }
}
