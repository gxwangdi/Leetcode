
First of all, the input array is unsorted, and it has requirements on original index.     

Use sliding window, with size k.   `cause abs(i - j) <= k;

Secondly, abs(A[i] - A[j]) <= t, then we will need to use ceiling() or floor() in O(logk).  so think of  TreeSet.    

Space O(k),    Time O(nlogk)   k== O(n).  


