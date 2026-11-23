class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<tuple<int, int, int>> output;
        set<set<int>> test;
        vector<vector<int>> arr;
        unordered_map<int, int> nums_map;
        for (int i = 0; i < nums.size() - 2; i++){
            for (int j = i + 1; j < nums.size(); j++){
                if (nums_map.find(-(nums[i] + nums[j])) != nums_map.end()){
                    nums_map[-(nums[i] + nums[j])] = nums[j];
                    set<int> e = {nums[i], -(nums[i] + nums[j]), nums[j]};
                    if(test.count(e)){
                        continue;
                    }else{
                        output.insert({nums[i], -(nums[i] + nums[j]), nums[j]});
                        test.insert(e);  
                    }
                // output.insert({nums[i], -(nums[i] + nums[j]), nums[j]});
                
                }else{
                    nums_map[nums[j]] = 0;
                }
            }
            nums_map.clear();
        }

        for(auto t : output){
            arr.push_back({get<0>(t), get<1>(t), get<2>(t)});
        }
        return arr;
    }
};
