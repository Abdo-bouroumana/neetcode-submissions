class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] costCumulation = new int[cost.length];
        costCumulation[cost.length - 1] = cost[cost.length - 1];
        costCumulation[cost.length - 2] = cost[cost.length - 2];

        for(int i = cost.length - 3; i >= 0; i--){
            costCumulation[i] = Math.min(costCumulation[i + 1], costCumulation[i + 2]) + cost[i];
        }
        return Math.min(costCumulation[0], costCumulation[1]);

    }
}
