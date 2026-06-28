class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cost = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < cost) {
                cost = prices[i];
            } else if (profit < prices[i] - cost) {
                profit = prices[i] - cost;
            }
        }

        return profit;
    }
}
