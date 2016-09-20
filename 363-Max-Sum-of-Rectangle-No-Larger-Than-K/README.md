
Well,  a naive dp solution would be O(n^2) time O(n^2) space.       

dp[n][m] = arr[n][m] + dp[n-1][m] + dp[n][m-1] - dp[n-1][m-1].    

  