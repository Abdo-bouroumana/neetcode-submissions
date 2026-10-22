class Solution {
public:
    
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> nums_map;
        vector<int> result;
        for(int i = 0;i < nums.size();i++){
            nums_map[nums[i]] += 1;
        }
        int max = 0,toAdd;
        for(int j = 0; j < k;j++){
            max = 0;
            for(auto j : nums_map){
                if(j.second > max){
                    max = j.second;
                    toAdd = j.first;
                }
            }
            result.push_back(toAdd);
            nums_map.erase(toAdd);
        }
        
        return result;
    }
};
