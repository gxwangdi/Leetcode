
If it is O(n^2), dp[i] means up to pos i the longest increasing subsequence.     

Init:  nums[0] =1;

Transition:
If nums[i] < nums[i-1], dp[i] = 1;  
If nums[i] > nums[i-1], check 0...i-1,   dp[i] = max{dp[x], nums[i]>nums[x]} +1.   

Answer:
dp[n-1].    

   