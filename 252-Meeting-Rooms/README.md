
I would probably sort all intervals based on start time, and end time.  

And check if cur.end > cur+1.start.    If there is one, then return false;

Or return true.  

Space O(1), Time O(nlogn).  n is the number of intervals. 