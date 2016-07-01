public class Solution {
    
    /* // O(nlogn) solution
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length ==0) {
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        while (left + 1 < right) {
            int mid = left + (right - left)/2;
            int count = numBelow(nums, mid);
            if (count < mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
    
    private int numBelow(int[] nums, int target) {
        int res = 0;
        for (int i : nums) {
            if (i<=target) {
                res++;
            }
        }
        return res;
    }*/
    
    public int findDuplicate(int[] nums) {
    int n=nums.length-1;
    int left=0, right=n; 
    while(left<right){
        int mid=left+(right-left)/2;
        int count=numBelow(nums, mid);
        if(count>mid) right=mid;
        else left=mid+1;
    }
    return left;
}
public int numBelow(int[] nums, int target){
    int result=0;
    for(int i=0; i<nums.length; i++)
        if(nums[i]<=target) result++;
    return result;
  }
    
    /* // O(n) solution from online. 
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length ==0) {
            return -1;
        }
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        
        fast = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }*/
}




