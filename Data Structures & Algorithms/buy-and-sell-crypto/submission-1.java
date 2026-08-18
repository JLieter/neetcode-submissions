class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int result = 0;

        while (r < prices.length) {
            int buy = prices[l];
            int sell = prices[r];
            if (buy < sell) {
                int profit = sell - buy;
                result = Math.max(profit, result);
            } else {
                l=r;
            }
            r++;
        }
        return result;   
    }
}
