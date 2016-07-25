public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target <=0) {
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> progress = new ArrayList<>();
        getCombinations(candidates, 0, res, progress, target);
        return res;
    }
    
    private void getCombinations(int[] src, int start, List<List<Integer>> res, List<Integer> progress, int left) {
        for (int i = start; i<src.length; i++) {
            int val = left - src[i];
            if (val == 0) {
                List<Integer> list = new ArrayList<>(progress);
                list.add(src[i]);
                res.add(list);
                continue;
            }
            if (val > 0) {
                List<Integer> list = new ArrayList<>(progress);
                list.add(src[i]);
                getCombinations(src, i, res, list, val);
            }
        }
    }// end of getCombinations
}



