/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        List<Pair> list = new ArrayList<>(intervals.length*2);
        for (Interval i : intervals) {
            list.add(new Pair(i.start, 1));
            list.add(new Pair(i.end, -1));
        }
        Collections.sort(list, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2) {
                if (p1.time != p2.time) {
                    return p1.time - p2.time;
                }
                return p1.plusOne - p2.plusOne;
            }
        });
        int count = 0;
        int max = 0;
        for (int i=0; i<list.size(); i++) {
            Pair p = list.get(i);
            count += p.plusOne;
            max = Math.max(max, count);
        }
        
        return max;
    }
    
    private static class Pair {
        public int time;
        public int plusOne;
        public Pair(int t, int p) {
            time = t;
            plusOne = p;
        }
    }// end of Pair
}



