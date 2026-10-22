class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char, int> s_map;
        unordered_map<char, int> t_map;
        for(char c : s){
            s_map[c]++;
        }
        for(char c : t){
            t_map[c]++;
        }
        if(s_map.size() == t_map.size()){
            for(auto e : s_map){
                if(t_map.find(e.first) == t_map.end()) return false;
                if(t_map[e.first] != e.second) return false;

                return true;
            }
        }else{
            return false;
        }


        
    }
};
