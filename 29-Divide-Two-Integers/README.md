
Relative easy to think, but difficult to implement it correctly.  

PAY ATTENTION to corner case.

divisor==0 should be first, and then dividend==0, or if dividend is Integer.MIN_VALUE, as the absolute value of Integer.MIN_VALUE is bigger than that of Integer.MAX_VALUE;

Then we use bit shift operation, this is what I thought.    

