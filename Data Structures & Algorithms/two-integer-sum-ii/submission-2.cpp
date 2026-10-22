class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> arr;
        int i(0), j(numbers.size() - 1);
        while(numbers[i] + numbers[j] != target){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else {
                i++;
            }
        }
        arr.push_back(i + 1);
        arr.push_back(j + 1);
        return arr;
    }
};
