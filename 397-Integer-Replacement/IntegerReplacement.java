public class IntegerReplacement {
    public int integerReplacement(int n) {
        long N = n;
        long small, big;
        int count = 0;
        while (N!=1) {
            small = (N & (N-1));
            big = (N & (N+1));
            if ( (N&1)==0 ) { // For even number, divide 2.  
                N >>=1;
            } else if ( (small & (small-1)) <= (big & (big-1)) ) {
                N = N-1;
            } else {
                N = N+1;
            }
            count++;
        }
        return count;
    }
    /*
    public int integerReplacement(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        int cur = 1;
        while (cur < n) {
            cur = cur<<1;
            count++;
        }
        if (cur == n) {
            return count;
        }
        return count+1;
    }// end of integerReplacement  
    */
}




