
Define dp[i] as the possible cases for n posts.

dp[0] = 1;
dp[1] = k;
dp[2] = k*k;

dp[i] = dp[i-1]*k - dp[i-2];  i=3, ... n.  

answer:  dp[n].  

 