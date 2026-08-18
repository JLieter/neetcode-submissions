class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int result = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                result = Math.max(profit, result);
            } else {
                l=r;
            }
            r++;
        }
        return result;   
    }
}
