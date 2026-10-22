class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = prices[0];
        int right = prices[0]; 
        int n = prices.length;
        for(int i = 0; i < n; i++){
            if(prices[i] - left > maxProfit){
                right = prices[i];
                maxProfit = prices[i] - left;
            }else if(prices[i] - left < 0){
                left = prices[i];
            }
        }
        return maxProfit;
    }
}
