class Solution {
public:
    vector<int> indexes;
    string encode(vector<string>& strs) {
        string s;
        for(string str : strs){
            s += str;
            indexes.push_back(s.size());
        }
        return s;
    }

    vector<string> decode(string s) {
        vector<string> strs;
        int j = 0;
        for(int i = 0; i < indexes.size(); i++){
            strs.push_back(s.substr(j,indexes[i] - j));
            j = indexes[i];
        }
        return strs;
    }
};
