class Solution {
public:
    vector<int> indexes;
    string encode(vector<string>& strs) {
        string str = "";
        for(string i : strs){
            str += i;
            indexes.push_back(i.size());
        }
        return str;
    }

    vector<string> decode(string s) {
        vector<string> strs;
        int start = 0;
        for(int i = 0; i < indexes.size();i++){
            strs.push_back(s.substr(start,indexes[i]));
            start = start + indexes[i];
        }
        return strs;
    }
};
