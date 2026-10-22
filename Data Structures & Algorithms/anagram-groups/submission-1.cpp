class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> str_map;
        vector<vector<string>> arr;
        for(string str : strs){
            string tmp = str;
            sort(tmp.begin(), tmp.end());
            str_map[tmp].push_back(str);
        }
        for(auto e : str_map){
            arr.push_back(e.second);
        }
        return arr;
    }
};
