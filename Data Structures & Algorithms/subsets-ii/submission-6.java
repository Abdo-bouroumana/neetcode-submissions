        


class Solution {
    public void backtracking(int[] nums, List<Integer> list, int i, Set<List<Integer>> resultSet){
        for(int j = i; j < nums.length; j++){
            list.add(nums[j]);
            if(resultSet.contains(list)){
                list.remove(list.size() - 1);
                continue;
            }
            resultSet.add(new ArrayList(list));
            backtracking(nums, list, j + 1, resultSet);
            list.remove(list.size() - 1);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        backtracking(nums, new ArrayList<>(), 0, result);
        return new ArrayList<>(result);
    }
}
