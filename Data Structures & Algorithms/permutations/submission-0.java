class Solution {
    public void backtracking(int[] nums, Set<Integer> checkingSet, List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length){
            List<Integer> copy = new ArrayList<>(list);
            result.add(copy);
        }
        for(int i = 0; i < nums.length; i++){
            if(checkingSet.contains(nums[i])) continue;
            checkingSet.add(nums[i]);
            list.add(nums[i]);
            backtracking(nums, checkingSet, list, result);
            checkingSet.remove(nums[i]);
            list.remove(list.size() - 1);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, new HashSet<>(), new ArrayList<>(), result);
        return result;
    }
}
