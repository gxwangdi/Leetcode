
Basically use 3sum, since it is asking for the number of solution, not the exact index, so we can sort !  

i, j,  k,  if the sum is bigger than target, move k to the left, and once the sum is less then,  count += k-j.  

Time O(n^3) Space O(1).     
===========================================


   