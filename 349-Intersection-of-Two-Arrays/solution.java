public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1==null || nums2==null || nums1.length ==0 || nums2.length ==0)
            return new int[0];
            
        int[] big;
        int[] small;
        if (nums1.length > nums2.length) {
            big = nums1;
            small = nums2;
        } else {
            big = nums2;
            small = nums1;
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i:small) {
            set.add(i);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i:big) {
            if (set.contains(i)) {
                result.add(i);
                set.remove(i);
            }
        }
        int[] reslist = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            reslist[i] = result.get(i);
        }
        
        return reslist;
    }// end 
}