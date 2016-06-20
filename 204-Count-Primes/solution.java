

public class Solution {
    public int countPrimes(int n) {
        List<Integer> list = new ArrayList<>();
        if (n<3) {
            return list.size();
        }
        list.add(2);
        for (int i=3; i<n; i++) {
            if (isPrime(i, list)) {
                list.add(i);
            }
        }
        return list.size();
    }// end of countPrimes 
    
    private boolean isPrime(int p, List<Integer> list) {
        if (p<0 || list.isEmpty()) {
            return false;
        }
        for (int i=0; i<list.size(); i++) {
            int temp = list.get(i);
            if (temp*temp > p) {
                return true;
            }
            if (p%temp == 0) {
                return false;
            }
        }
        return false;
    }// end of isPrime.
}




