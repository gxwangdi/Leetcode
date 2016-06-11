public class Solution {
    
    public String getHint(String secret, String guess) {
        StringBuilder sb = new StringBuilder();
        int numA =0;
        int numB =0;
        if (secret == null || guess == null || secret.length() == 0 || guess.length() == 0) {
            sb.append(numA).append("A").append(numB).append("B");
            return sb.toString();
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<secret.length(); i++) {
            char a = secret.charAt(i);
            if ( a == guess.charAt(i))
                numA ++;
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a)+1);
            }
        }
        
        for (int i=0; i<guess.length(); i++) {
            char b = guess.charAt(i);
            if (!map.containsKey(b)) {
                continue;
            }
            numB++;
            int f = map.get(b);
            if (f == 1) {
                map.remove(b);
            } else {
                map.put(b, f-1);
            }
        }
        sb.append(numA).append("A").append(numB-numA).append("B");
        return sb.toString();
    }
}