public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || k<=0) {
            return res;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(k+1, pairComparator);
        for (int key : map.keySet()) {
            Pair p = new Pair(key, map.get(key));
            minHeap.offer(p);
            if (minHeap.size()>k) {
                minHeap.poll();
            }
        }
        
        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll().key);
        }
        Collections.reverse(res);
        return res;
    }// end of topKFrequent
    
    private Comparator<Pair> pairComparator = new Comparator<Pair>(){
       public int compare(Pair p1, Pair p2) {
           if (p1.frequency != p2.frequency) {
               return p1.frequency - p2.frequency;
           }
           return p1.key - p2.key;
       } 
    };
    
    private static class Pair {
        public int key;
        public int frequency;
        public Pair(int k, int f) {
            key = k;
            frequency = f;
        }
    }
}



