public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k<=0 || prices == null || prices.length == 0) {
            return 0;
        }
        
        if (k>=prices.length/2) {
            return solveMaxProfit(prices); 
        }
        
        int[] g = new int[k+1];
        int[] l = new int[k+1];
        for (int i=0; i<prices.length-1; i++) {
            int diff = prices[i+1] - prices[i];
            for (int j=k; j>=1; j--) {
                l[j] = Math.max(g[j-1] + Math.max(diff, 0), l[j] + diff);
                g[j] = Math.max(g[j], l[j]);
            }
        }
        return g[k];
    }
    
    // Sell and buy stock II
    private int solveMaxProfit(int[] prices) {
        int max = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] - prices[i-1] > 0) {
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }// end of solveMaxProfit     
}