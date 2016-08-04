public class Solution {
    public int hIndex(int[] citations) {
        int res = 0;
        if (citations == null || citations.length == 0) {
            return res;
        }
        
        int n = citations.length;
        if (citations[0] >= n) {
            return n;
        }
        int cur = n-1;
        while (cur > 0) {
            int h = n - cur;
            if (citations[cur] < h) {
                break;
            }
            if (citations[cur-1] <= h) {
                res = h;
            }
            cur--;
        }
        return res;
    }
}



