class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, pair<int, int>> n_map;
        for(int i = 0; i < nums.size(); i++){
            if(n_map.find(nums[i]) != n_map.end()){
                vector<int> arr = {n_map[nums[i]].second, i};
                return arr;
            }

            n_map[target - nums[i]] = {nums[i], i};

        }
    }
};
