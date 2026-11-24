class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n + 1];
        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = second + first;
            first = second;
            second = dp[i];
        }

        return dp[n];
    }
}
