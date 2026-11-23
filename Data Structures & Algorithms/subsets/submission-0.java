class Solution {
    public void backtracking(int[] nums, List<Integer> prev, int i, List<List<Integer>> result){
        if(i == nums.length) return;
        for(int j = i; j < nums.length; j++){
            List<Integer> copy = new ArrayList<>(prev);
            copy.add(nums[j]);
            result.add(copy);
            backtracking(nums, copy, j+1, result);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backtracking(nums, new ArrayList<>(), 0, result);
        return result;
    }
}
