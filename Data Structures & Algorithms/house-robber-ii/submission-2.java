class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2) return nums[0];
        int[] robbedMoney = new int[n];
        boolean[] tracker = new boolean[n];
        int max = 0;
        for(int j = 0; j < n; j++){
            Arrays.fill(tracker, false);
            tracker[j] = true;
            robbedMoney[j] = nums[j];
            robbedMoney[(j + 1)%n] = nums[(j+1)%n];
            int i;
            for(i = j + 2; i < n + j; i++){
                robbedMoney[i%n] = robbedMoney[(i - 2)%n] + nums[i%n];
                if(tracker[(i - 2)%n]) tracker[i%n] = true; 
                if(robbedMoney[(i - 1)%n] < robbedMoney[(i - 2)%n] && tracker[(i - 2)%n]) tracker[(i - 1)%n] = true; 
                robbedMoney[(i - 1)%n] = Math.max(robbedMoney[(i - 1)%n], robbedMoney[(i - 2)%n]);
                
            }
            if(tracker[(i - 1)%n]) max = robbedMoney[(i - 2)%n] > max ? robbedMoney[(i - 2)%n] : max;
            else max = Math.max(max, Math.max(robbedMoney[(i - 1)%n], robbedMoney[(n - 2)%n]));
        }

        return max;
    }
}
