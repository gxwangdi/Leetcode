public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);
        if (nums == null || nums.length == 0) {
            return res;
        }
        int left = 0;
        int right = nums.length-1;
        while (left+1 < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                right = mid;
                continue;
            }
            if (nums[mid] < target) {
                left = mid +1;
                continue;
            }
            if (nums[mid] > target) {
                right = mid -1;
            }
        }
        if (nums[left]==target) {
            res[0] = left;
        } else if (nums[right] == target) {
            res[0] = right;
            left = right;
        }
        if (res[0] == -1) {
            return res;
        }
        
        right = nums.length -1;
        while (left+1 < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                left = mid;
                continue;
            }
            if (nums[mid] < target) {
                left = mid + 1;
                continue;
            }
            if (nums[mid] > target) {
                right = mid -1;
            }
        }
        if (nums[right]==target) {
            res[1] = right;
        } else if (nums[left]==target) {
            res[1] = left;
        }
        return res;
    }
}