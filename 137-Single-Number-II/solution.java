public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        int[] bits = new int[32];
        for (int i=0; i<32; i++) {
            for (int j : nums) {
                bits[i] += (j>>i)&1;
                bits[i] = bits[i]%3;
            }
            bits[i] = bits[i]<<i;
            result = result|bits[i];
        }
        return result;
    }
}

