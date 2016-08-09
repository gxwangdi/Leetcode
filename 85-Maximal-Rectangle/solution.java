public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        boolean[][] dp = new boolean[2][n+1];
        int maxRectangle = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j]=='0') {
                    continue;
                }
                for (int xLen=1; i+xLen-1<m; xLen++) {
                    for (int yLen=1; j+yLen-1<n; yLen++) {
                        if (matrix[i+xLen-1][j+yLen-1] == '0') {
                            dp[0][yLen] = false;
                            break;
                        }
                        if (xLen == 1 && yLen == 1) {
                            dp[1][yLen] = true;
                        } else if (xLen == 1 && yLen != 1) {
                            dp[1][yLen] = dp[1][yLen-1];
                        } else if (xLen != 1 && yLen == 1) {
                            dp[1][yLen] = dp[0][yLen];
                        } else {
                            dp[1][yLen] = dp[1][yLen-1] && dp[0][yLen];
                        }
                        if (dp[1][yLen]) {
                            maxRectangle = Math.max(xLen * yLen,maxRectangle);
                            dp[0][yLen] = dp[1][yLen];
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return maxRectangle;
    }// end of maximalRectangle     
}





