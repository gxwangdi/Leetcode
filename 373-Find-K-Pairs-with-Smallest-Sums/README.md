
Brute force manner would be, to prepare a maxHeap, and maintain size k, and scan all possible pairs.   If arrA.length * arrB.length <=k, then brute force to take every single pair. 

Two pointers, i points to pos in arrA,  j points to pos in arrB.     
Take <i, j> into result set.  

if (A[i] + B[j+1] > A[i+1] + B[j])   i++;
else j++;  

Space O(k), Time O(k).   



 