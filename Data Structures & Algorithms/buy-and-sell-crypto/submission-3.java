class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int finalProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            int profit = prices[i] - prices[buy];
            
            if (profit > finalProfit) {
                finalProfit = profit;
            }
            
            if (prices[buy] > prices[buy + 1]) {
                buy++;
            } else if (prices[i] < prices[buy]) {
                buy = i;
            }
        }
        return finalProfit;
    }
}

// Initial thoughts
// set buy at 0
// since we only need to return the profit not any indexes i dont think hashmap is needed
// you cant sell a value before you buy tho so it needs to be a buy at lowest price then sell at highest price
// we could loop through the array current value can be sell once the loop finishes we can increment the buy if the next value is less than the buy value so we ensure we buy at the lowest and only update profit if it increases not decreases.