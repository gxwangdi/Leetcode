public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length()<1)
            return 0;
        
        String[] arr = s.split("[ ]+");
        return arr[arr.length-1].length();
    }
}