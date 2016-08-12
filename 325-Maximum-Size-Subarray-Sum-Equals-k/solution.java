public class Solution {
    
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length <1) {
            return 0;
        }
        int max = 0;
        int n = nums.length;
        int[] sum = new int[n+1];
        sum[0] = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(k, 0);
        for (int i=1; i<=n; i++) {
            sum[i] = sum[i-1]+nums[i-1];
            if (map.containsKey(sum[i])) {
                int len = i - map.get(sum[i]);
                max = Math.max(max, len);
            }
            int key = k+sum[i];
            // Do not update if it contains.
            if (!map.containsKey(key)) {
                map.put(key, i);
            }
        }
        return max;
    }
    
    /*
    // My implementation does not work.  
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length <1) {
            return 0;
        }
        int i =0;
        int j =0;
        int maxLen = 0;
        int sum = nums[0]; 
        while (i<nums.length) {
            if (sum == k) {
                maxLen = Math.max(maxLen, j-i+1);
            }
            // j reaches the end of the arr.
            if (j == nums.length-1) {
                sum -= nums[i];
                i++;
                continue;
            }
            
            if ((sum>k)^(nums[i]>0)) {
                j++;
                sum += nums[j];
            } else {
                sum-=nums[i];
                i++;
            }
        }
        return maxLen;
    }*/
    
}






