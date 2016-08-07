public class Solution {
    
    // DP approach
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i=1; i<=m; i++) {
            dp[i][0] = false;
        }
        for (int j=1; j<=n; j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = true;
            } else {
                break;
            }
        }
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (p.charAt(j-1)!='*') {
                    dp[i][j] = dp[i-1][j-1] 
                        && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?');
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];          
    }
    
    /*
    // Recursive manner,  TLE
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return isMatch(s, 0, p, 0);
    }
    
    private boolean isMatch(String s, int i, String p, int j) {
        if (i == s.length() && j == p.length()) {
            return true;
        }
        if (i < s.length() && j == p.length()) {
            return false;
        }
        if (i == s.length()) {
            String temp = p.substring(j);
            for (int cur=0; cur<temp.length(); cur++) {
                if (temp.charAt(cur) != '*') {
                    return false;
                }
            }
            return true;
        }
        char c1 = s.charAt(i);
        char c2 = p.charAt(j);
        if (c1 == c2 || c2 == '?') {
            return isMatch(s, i+1, p, j+1);
        } else if (c2 == '*') {
            return isMatch(s, i+1, p, j) || isMatch(s, i+1, p, j+1) || isMatch(s, i, p, j+1);
        } else {
            return false;
        }
    }// end of isMatch.    
    */
}



