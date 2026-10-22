class Solution {

    

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        int[] resultArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            Integer j = seen.get(target - nums[i]);
            if(j != null){
                resultArr[0] = j;
                resultArr[1] = i;
                break;
            }
            seen.put(nums[i], i);
        }
        return resultArr;

    }

}
