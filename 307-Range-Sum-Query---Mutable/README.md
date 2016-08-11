
Besides brute force approach, a normal way is to use prefix sum.    

Let Sum[i] = Sum{A 0....i} 

Sum[i, j] = Sum[j] - Sum[i-1].    The problem is, it takes O(n) for every single update operation, good thing is rangeSum is O(n)  
================================================

Well, organize the data in the form of segment tree, then O(logn) for both update and rangeSum.    



