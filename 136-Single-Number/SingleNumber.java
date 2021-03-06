public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i : nums) {
            res = res ^ i;
        }
        return res;
    }
}