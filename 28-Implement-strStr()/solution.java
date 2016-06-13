public class Solution {
    
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;
            
        Set<String> set = new HashSet<>();
        set.add(needle);
        for (int i=0; i<=haystack.length()-needle.length(); i++) {
            if (set.contains(haystack.substring(i, i+needle.length())))
                return i;
        }
        return -1;
    }
    
    /* // Java API 
    public int strStr(String haystack, String needle) {
        if (haystack == null) 
            return -1;
        return haystack.indexOf(needle);
    }*/
}