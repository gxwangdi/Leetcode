
Brute force is like,  get each subarray, and get the sum for the sub-range. If it equals to k, update max.   

Space O(1) Time O(n^2).   

For Time O(n^2), it is not good to use dp. dp takes O(n^2) space and time.   

I would think of using a queue, or two pointer to build a sliding window, like i and j, so any time the length is j-i+1.    

We make a sum to track the sum of the sliding window,
If the sum equals to k, then update max; 
If the sum is bigger then k and  arr[i] >0, then i++;
If the sum is less then k and arr[i] < 0, then i++;
if (j == arr.length-1) i++; 
else j++;

Space O(1), Time O(n).   


