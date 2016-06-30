public class Solution {
    
    /* // Recursive approach
    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b)<<1;
        return getSum(sum, carry);
    }*/
    
    public int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        while (b!=0) {
            int carry = a&b;
            a = a ^ b;
            b = carry<<1;
        }
        return a;
    }
}


