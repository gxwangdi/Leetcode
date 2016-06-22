public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        List<Integer> list = new ArrayList<>();
        res.add(list);
        for (int i=0; i < nums.length; i++) {
            List<List<Integer>> level = new ArrayList<>();
            for (List<Integer> l : res) {
                for (int j=0; j<=l.size(); j++) {
                    list = new ArrayList<>(l);
                    list.add(j, nums[i]);
                    if (!level.contains(list)) {
                        level.add(list);
                    }
                }
            }
            res = level;
        }
        return res;
    }// end of permuteUnique    
}