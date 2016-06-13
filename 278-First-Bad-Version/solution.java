/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2; // mid = (end + start)/2; exceeds time limit! 
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
            
        if (isBadVersion(start)) {
            return start;
        }
        return end;
    }
    
    /*   // Time limit exceeds. Be very conservertive to use isBadVersion(int), treat it as a time consuming op.
    public int firstBadVersion(int n) {
        if (n<1 || isBadVersion(1))
            return 1;
        int start = 1;
        int end = n;
        while (start+1<end) {
            int mid = (start+end)/2;
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid-1))
                    return mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }*/
}