class Solution {

    

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] resultArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null ){
                resultArr[0] = map.get(nums[i]).get(1);
                resultArr[1] = i;
                break;
            }else{
                map.put(target - nums[i], new ArrayList<>(List.of(nums[i], i)));
            }
        }
        return resultArr;

    }

}
