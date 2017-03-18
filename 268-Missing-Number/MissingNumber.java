public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int res = 0;
        for (int i=0; i<nums.length; i++) {
            res = res ^ nums[i] ^ (i+1);
        }
        return res;
    }
    
    /*  // binary search on the first one that nums[i]>i. But nums is not guarantee to be sorted.
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left+1<right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == mid) {
                left = mid + 1;
                continue;
            }
            if (nums[mid] > mid) {
                right = mid;
                continue;
            }
        }
        if (nums[left] > left) {
            return left;
        }
        if (nums[right] > right) {
            return right;
        }
        return nums.length;
    }*/
}