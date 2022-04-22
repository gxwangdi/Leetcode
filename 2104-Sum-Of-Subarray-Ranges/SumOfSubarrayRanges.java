

// class SumOfSubarrayRanges {
//     public long subArrayRanges(int[] nums) {
//         int n = nums.length;
//         long[][] dp = new long[n][n];
//         long ret = 0;
//         for (int length = 2; length <= n; length++) {
//             for (int start = 0; start < n; start++) {
//                 int end = start + length - 1;
//                 if (end < n) {
//                     dp[start][end] = Math.max(dp[start + 1][end], Math.max(dp[start][end - 1], Math.abs(nums[start] - nums[end])));
//                     ret += dp[start][end];
//                 } else {
//                     break;
//                 }
//             }
//         }
//         return ret;
//     }
// }


class Pair{
    int val;
    int count;
    Pair(int v,int c){
        val = v;
        count= c;
    }
}
class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        Stack<Pair> leftStack = new Stack<Pair>();
        Stack<Pair> righStack = new Stack<Pair>();
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i = 0; i< nums.length ; i++){
            int count =1;
            while(!leftStack.isEmpty() && leftStack.peek().val > nums[i]){
                count  += leftStack.peek().count;
                leftStack.pop();
            }
            leftStack.add(new Pair(nums[i], count));
            left[i] = count;

        }
        for(int i = nums.length - 1; i >= 0 ; i--){
            int count = 1;
            while(!righStack.isEmpty() && righStack.peek().val >= nums[i]){
                count += righStack.peek().count;
                righStack.pop();
            }
            righStack.add(new Pair(nums[i], count));
            right[i] = count;

        }
        long completeMin = 0;
        for(int i = 0; i< nums.length ; i++){
            long temp = left[i]*right[i];
            completeMin = completeMin + (nums[i]* temp);
        }

        leftStack.clear();
        righStack.clear();
        for(int i = 0; i< nums.length ; i++){
            int count =1;
            while(!leftStack.isEmpty() && leftStack.peek().val < nums[i]){
                count  += leftStack.peek().count;
                leftStack.pop();
            }
            leftStack.add(new Pair(nums[i], count));
            left[i] = count;

        }
        for(int i = nums.length - 1; i >= 0 ; i--){
            int count = 1;
            while(!righStack.isEmpty() && righStack.peek().val <= nums[i]){
                count += righStack.peek().count;
                righStack.pop();
            }
            righStack.add(new Pair(nums[i], count));
            right[i] = count;

        }
        long completeMax = 0;
        for(int i = 0; i< nums.length ; i++){
            long temp = left[i]*right[i];
            completeMax = completeMax + nums[i]*temp;
        }
        return Math.abs(completeMax - completeMin);
    }
}
