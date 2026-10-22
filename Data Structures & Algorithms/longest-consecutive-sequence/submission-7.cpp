class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> check_set;
        vector<int> l;

        int count(1), max(1);
        if(nums.size() == 0){
            return 0;
        }
        for(int i = 0; i < nums.size(); i++){
            check_set.insert(nums[i]);
        }

        for(int x : check_set){
            l.push_back(x);
        }

        for(int i = 1; i < l.size(); i++ ){
            if(l[i] - 1 > l[i - 1]){
                if(count > max) max = count;
                count = 1;
            }else{
                count++;
            }
            
        }
        if(count>max) max = count;
        return max;
    }
};
