public class Solution {
    /*
    public int mySqrt(int x) {
        if (x<0) {
            return -1;
        }
        int left = 0;
        int right = x;
        long t;
        while (left+1 < right) {
            int mid = left + (right-left)/2;
            t = mid*mid;
            if (t == x) {
                return mid;
            } else if (t < x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        t = right * right;
        if (t > x) {
            return left;
        } 
        return right;
    }*/
    
    // Newton recursion 
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double last = 0.0;
        double res = 1.0;
        while (res != last) {
            last = res;
            res = (res + x/res)/2;
        }
        return (int)res;
    }
}



