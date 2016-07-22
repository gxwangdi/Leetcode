/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int cur = 0;
        char[] temp = new char[4];
        while (cur < n) {
            int len = read4(temp);
            int i=0;
            while (i<len && cur<n) {
                buf[cur++] = temp[i++];
            }
            if (len < 4) {
                break;
            }
        }
        return cur;
    }
}




