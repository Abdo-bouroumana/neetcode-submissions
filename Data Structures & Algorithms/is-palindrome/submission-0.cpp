class Solution {
public:
    bool isPalindrome(string s) {
        bool t = true;
        int j(s.size() - 1), i(0);
        while(i < j){
            if(!isalnum(s[i])){
                i++;
                continue;
            }
            if(!isalnum(s[j])){
                j--;
                continue;
            }
            if(tolower(s[i]) != tolower(s[j])){
                t = false;
                break;
            }
            i++;
            j--;
        }
        return t;
    }
};
