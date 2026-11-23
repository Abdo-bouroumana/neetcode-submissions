// insertion
//   --> a word that doesn't exist
//   --> a word that already exist
//   --> a word that already exist but the last character isn't marked as true;
// 
// 

class PrefixTree {

    boolean end;
    Map<Character, PrefixTree> childs;

    public PrefixTree() {
        end = false;
        childs = new HashMap<>();
    }

    public void insert(String word) {
        if(word.equals("")) return;
        int len = word.length();
        PrefixTree curr = this;
        int i = 0;
        while(curr.childs.containsKey(word.charAt(i))){
            curr = curr.childs.get(word.charAt(i));
            if(i == len - 1) {
                curr.end = true;
                i++;
                break;
            }
            i++;
        }

        for(int j = i; j < len; j++){
            curr.childs.put(word.charAt(j), new PrefixTree());
            if(j == len - 1) curr.childs.get(word.charAt(j)).end = true;
            else curr = curr.childs.get(word.charAt(j));
        }
    }

    public boolean search(String word) {
        if(word.equals("")) return false;
        int len = word.length();
        PrefixTree curr = this;
        int i = 0;
        while(curr.childs.containsKey(word.charAt(i))){
            curr = curr.childs.get(word.charAt(i));
            if(i == len - 1) break; 
            i++;
        }
        if(i == len - 1 && curr.end == true) return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        if(prefix.equals("")) return false;
        int len = prefix.length();
        PrefixTree curr = this;
        int i = 0;
        while(curr.childs.containsKey(prefix.charAt(i))){
            curr = curr.childs.get(prefix.charAt(i));
            if(i == len - 1) return true; 
            i++;
        }
        return false;
    }
}
