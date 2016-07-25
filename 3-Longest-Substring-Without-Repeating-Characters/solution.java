public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        boolean[] flag = new boolean[256];
        int res = 0;
        int start = 0;
        int len = s.length();
        for (int i=0; i<len; i++) {
            char cur = s.charAt(i);
            if (!flag[cur]) {
                flag[cur] = true;
                continue;
            }
            res = Math.max(res, i-start);
            for (int j=start; j<i; j++) {
                char c = s.charAt(j);
                if (c == cur) {
                    start = j+1;
                    break;
                }
                flag[c] = false;
            }
        }
        res = Math.max(res, len - start);
        return res;
    }
}





