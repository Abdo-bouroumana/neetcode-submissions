class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size());
        int mul = 1;
        result[0] = 1;
        for(int i = 0; i < nums.size() - 1; i++){
            mul *= nums[i];
            result[i+1] = mul;
        }
        mul = 1;
        for(int j = nums.size() - 1; j > 0; j--){
            mul *= nums[j];
            result[j - 1] *= mul;
        }
        return result;

    }
};
