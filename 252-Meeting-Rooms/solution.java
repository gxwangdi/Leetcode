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
    
    private Comparator<Interval> intervalComparator = new Comparator<Interval>() {
        public int compare(Interval i1, Interval i2) {
            if (i1.start != i2.start) {
                return i1.start - i2.start;
            }
            return i1.end - i2.end;
        }
    };
    
    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals == null || intervals.length <2) {
            return true;
        }
        Arrays.sort(intervals, intervalComparator);
        for (int i=0; i<intervals.length-1; i++) {
            if (intervals[i].end > intervals[i+1].start) {
                return false;
            }
        }
        return true;
    }
}




