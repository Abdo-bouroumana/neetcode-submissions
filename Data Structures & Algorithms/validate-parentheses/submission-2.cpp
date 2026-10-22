class Solution {
public:
    bool isValid(string s) {
        unordered_map<char, char> brackets = {{'(',')'}, {'{','}'}, {'[', ']'}};
        if(s.size() == 1 || s.size()%2 != 0){
            return false;
        }else{
            bool test = true;
            stack<char> openBr;
            for(int i = 0;i < s.size();i++){
                auto it = brackets.find(s[i]);
                if(openBr.empty()){
                    if(it != brackets.end())
                        openBr.push(s[i]);
                    else return false;
                }else if(brackets[openBr.top()] == s[i]){
                    openBr.pop();
                }else if(it != brackets.end()){
                    openBr.push(s[i]);
                }else if(it == brackets.end() && brackets[openBr.top()] != s[i]){
                    return false;
                }
            }
            if(openBr.empty())return test;
            else return false;
        }
    }
};
