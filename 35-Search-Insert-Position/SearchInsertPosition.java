public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        return searchInsert(nums, target, 0, nums.length-1);
    }
    
    private int searchInsert(int[] nums, int target, int start, int end) {
        int mid = start + (end - start)/2;
        
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return start < mid? searchInsert(nums, target, start, mid-1):start;
        } else {
            return end > mid? searchInsert(nums, target, mid+1, end):(end+1);
        }
    }
    
    /*
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return Integer.MIN_VALUE;
        }
        if (nums.length == 0) {
            return 0;
        }
        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        if (target < nums[0]) {
            return 0;
        }
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            if (target == nums[left]) {
                return left;
            }
            if (target == nums[right]) {
                return right;
            }
            int mid = left + (right - left)/2;
            if (mid == left) {
                return right;
            }
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return Integer.MAX_VALUE;
    }
    */
}



