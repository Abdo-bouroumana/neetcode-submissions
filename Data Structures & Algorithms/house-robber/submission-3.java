class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2) return nums[0];
        int[] robbedMoney = new int[n];
        robbedMoney[0] = nums[0];
        robbedMoney[1] = nums[1];
        for(int i = 2; i < n; i++){
            robbedMoney[i] = robbedMoney[i - 2] + nums[i];
            robbedMoney[i - 1] = Math.max(robbedMoney[i - 1], robbedMoney[i - 2]);
        }
        return Math.max(robbedMoney[n - 1], robbedMoney[n - 2]);
    }
}
