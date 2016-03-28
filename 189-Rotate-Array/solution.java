public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || k<=0 || nums.length<=0 || k== nums.length) {
            return;
        }
        if (k>nums.length) {
            k = k - nums.length;
        }
        int[] rotate = new int[k];
        for (int i=0, j=nums.length-k; j<nums.length; i++, j++) {
            rotate[i] = nums[j];
        }
        
        for (int i=nums.length-(k+1), j=1; i>=0; i--, j++) {
            nums[nums.length-j] = nums[i];
        }
        
        for (int i=0; i<k; i++) {
            nums[i] = rotate[i];
        }
    }//end of rotate 
}