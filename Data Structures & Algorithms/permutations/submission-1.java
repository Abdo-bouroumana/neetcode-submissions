class Solution {
    public void backtracking(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] visited){
        if(list.size() == nums.length){
            List<Integer> copy = new ArrayList<>(list);
            result.add(copy);
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtracking(nums,  list, result, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        backtracking(nums, new ArrayList<>(), result, visited);
        return result;
    }
}
