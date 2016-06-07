

Cannot sort the array,  just brute force solution and check.                

Space O(1),   Time O(nk)          Get a TIME LIMIT EXCEEDED error.
==================================================

Considering a sliding window, need to use a set to store all elements, and a queue to check elements in the window. Every single step the window moves, remove the element at the tail first, and add the new element.  

Space O(k),   Time O(n)  