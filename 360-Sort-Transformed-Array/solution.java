public class Solution {
    
    
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        if (nums == null) {
            return null;
        }
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            res[i] = getTransform(a, b, c, nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
    
    private int getTransform(int a, int b, int c, int x) {
        return a*x*x + b*x + c;
    }
}





