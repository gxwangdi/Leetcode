public class Solution {
    
    // two pointer O(n3) approach. 
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length <4) {
            return res;
        }
        Arrays.sort(nums);    
        for (int i=0; i<nums.length-3; i++) {
            if (i!=0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j=i+1; j<nums.length-2; j++) {
                if (j!= i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                int pSum = nums[i] + nums[j];
                while (left < right) {
                    int temp = pSum + nums[left] + nums[right];
                    if (temp == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        do {
                            right--;
                        } while ( left<right && nums[right]==nums[right+1]);
                        do {
                            left++;
                        } while (left<right && nums[left]==nums[left-1]);
                    } else if (temp < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }// end of fourSum     
}



