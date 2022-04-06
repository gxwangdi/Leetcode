class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length<1){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int c=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                c++;
            }
            if(map.containsKey(sum-k)){
                c+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
