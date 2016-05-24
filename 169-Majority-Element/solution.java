public class Solution {
    
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n<3) return nums[0];
        int m = (n%2==0)? n/2:n/2+1;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int key:nums) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int count = map.get(key);
                if (count+1>=m) {
                    return key;
                }
                map.put(key, count+1);
            }
        }
        return 0;
    }// end of majorityElement     
}



