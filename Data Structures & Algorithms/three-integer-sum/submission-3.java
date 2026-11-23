class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<ArrayList<Integer>> triplets = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int target = 0 - nums[i];
            int j = 0;
            int k = nums.length - 1;
            while(j < k){
                if(j == i){
                    j++;
                    continue;
                }
                if(k == i){
                    k--;
                    continue;
                }
                if(nums[j] + nums[k] == target){
                    ArrayList<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(triplet);
                    triplets.add(triplet);
                    j++;
                    k--;
                }else if(nums[j] + nums[k] > target ){
                    k--;
                }else{
                    j++;
                }
            }
        }
        for(ArrayList<Integer> a : triplets){
            resultList.add(a);
        }

        return resultList;
        
    }
}
