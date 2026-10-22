class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> numsSet;
      for(auto num : nums){
        if(numsSet.find(num) != numsSet.end()){
            return true;
        }
        numsSet.insert(num);
      }  
      return false;
    }
};