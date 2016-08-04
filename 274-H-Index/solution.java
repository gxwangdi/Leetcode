public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        
        Arrays.sort(citations); // in ascending order
        int n = citations.length;
        if (citations[0] >= n) {
            return n;
        }
        int cur = n-1;   
        int res = 0;
        while (cur > 0) {
            int h = n - cur;
            if (citations[cur] < h) {
                break;
            }
            if (citations[cur-1]<= h) {
                res = h;
            }
            cur--;
        }
        return res;
    }// end of hindex     
}



