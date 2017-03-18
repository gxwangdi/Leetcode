public class PowXN {
    
    public double myPow(double x, int n) {
        if (n<0) {
            return 1/power(x, -n);
        } else {
            return power(x, n);
        }
    }
    
    private double power(double x, int n) {
        if (n == 0)
              return 1;
   
        double v = power(x, n / 2);
   
          if (n % 2 == 0) {
              return v * v;
          } else {
             return v * v * x;
          }
    }
    
    
    
    
    /*  // Does not work.  
    public double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        boolean isNegative = false;
        if (n<0) {
            isNegative = true;
            n = Math.abs(n);
        }
        
        double half = myPow(x, n/2);
        half = half*half;
        if (n%2 == 1) {
            if (isNegative) {
                x = 1/x;
            }
            half *= x;
        }
        if (isNegative) {
            return 1/half;
        }
        return half;
    }*/    
}




