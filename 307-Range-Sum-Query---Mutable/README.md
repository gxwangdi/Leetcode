
Besides brute force approach, a normal way is to use prefix sum.    

Let Sum[i] = Sum{A 0....i} 

Sum[i, j] = Sum[j] - Sum[i-1].    The problem is, it takes O(n) for every single update operation.  
================================================


