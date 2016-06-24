

public class Solution {
    
    /*
        Serach online and found a similar approach, but more concise implementation. 
        Based on https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes. 
    */ 
    public int countPrimes(int n) {
        if (n<3) {
            return 0;
        }
        
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i=2; i*i<n; i++) {
            if (primes[i]) {
                for (int j=i+i; j<n; j+=i) {
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for (boolean b:primes) {
            if (b) {
                count++;
            }
        }
        return count;
    }
    
    /* // Probable algorithm to determine prime in O(1), cannot find class BigInteger.
    public int countPrimes(int n) {
        int count = 0;
        if (n < 3) {
            return count;
        }
        for (int i=2; i<n; i++) {
            BigInteger big = new BigInteger(i+"");
            if (big.isProbablePrime(20)) {
                count++;
            }
        }
        return count;
    }*/
    
    // ==================== Below is my own implementation ====================
    /*
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
    */
}




