public class Solution {
    public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return -1;
        }
        
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i=0; i<n+1; i++) {
            dp[i][0] = i;
        }
        for (int j=0; j<m+1; j++) {
            dp[0][j] = j;
        }
        
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<m+1; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                }
            }
        }
        return dp[n][m];
    }// end minDistance
}





