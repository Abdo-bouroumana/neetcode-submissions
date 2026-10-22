class Solution {
public:
    bool isValid(string s) {
       unordered_map<char, char> characters = { {'(',')'}, {'{','}'}, {'[',']'} };
        stack<char> chars;
        for(int i = 0; i < s.size(); i++){
            if(characters.find(s[i]) != characters.end()){
                chars.push(s[i]);
            }else{
                if(!chars.empty() && s[i] == characters[chars.top()]){
                    chars.pop();
                }else{
                    return false;
                }
            }
        }
        if(chars.empty()){
            return true;
        }else{
            return false;
        } 
    }
};
