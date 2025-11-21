class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r = 1;
        int maxP = 0, profit=0;

        for(r = 1 ; r < prices.length; r++ )
        {
            if(prices[l] < prices[r])
            {
                profit = prices[r] - prices[l];
                maxP = Math.max(maxP , profit);
                
            }
            else
            {
                l = r;
                
            }

        }
        return maxP;
    }
}