public class Solution {
    
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int i1 = 0;
        int i2 = i1;
        while (i1 < nums.length) {
            if (nums[i1]!=0) {
                i1++;
                continue;
            }
            // nums[i1]==0
            i2 = i1+1;
            while (i2<nums.length && nums[i2]==0) {
                i2 ++;
            }
            if (i2 == nums.length) {
                break;
            }
            swap(nums, i1, i2);
            i1++;
        }
    }// end of moveZeroes           
    
    private void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }// end of swap            
}





