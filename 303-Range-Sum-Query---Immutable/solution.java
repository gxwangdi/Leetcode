public class NumArray {

    private int[] mNums = null;
    public NumArray(int[] nums) {
        if ( nums!=null && nums.length > 0) {
            mNums = nums;
        }
    }

    public int sumRange(int i, int j) {
        if (mNums == null) {
            return Integer.MIN_VALUE;
        }
        int min = Math.min(i, j);
        int max = Math.max(i, j);      
        if (min < 0) {
            min = 0;
        }
        if (max > mNums.length-1) {
            max = mNums.length-1;
        }
        
        int result = mNums[min];
        int iter = min + 1;
        while (iter<=max) {
            result += mNums[iter];
            iter ++;
        }
        return result;
    }// end of sumRange      
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);