
public class FibonacciNumber {
  public int fib(int N) {
        if (N < 0) {
            return -1;
        }
        if (N < 2) {
            return N;
        }
        int[] dp = new int[2];
        dp[0%2]=0;
        dp[1%2]=1;
        for(int j=2; j<=N; j++) {
            dp[j%2]=dp[(j-1)%2]+dp[(j-2)%2];
        }
        return dp[N%2];
    }
}
