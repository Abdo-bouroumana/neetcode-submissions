class Solution {
public:
    
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        for(int num : nums){
            m[num]++;
        }
        map<int, vector<int>> result;
        for(auto x : m){
            result[x.second].push_back(x.first);
        }
        vector<int> arr;
        for(auto i : result){
            for(int j = 0; j < i.second.size(); j++){
                arr.push_back(i.second[j]);
            }
        }
        vector<int> rs;
        int j = arr.size() - 1;
        for(int i = 0; i < k; i++){
            rs.push_back(arr[j]);
            j--;
        }
        
        return rs;

    }
};
