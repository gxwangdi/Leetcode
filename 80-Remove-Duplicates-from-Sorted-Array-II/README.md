
For single duplicate, once we find duplicates, ignore it.  

Now we can use a boolean isDuplicate, init as false;
if arr[cur] != arr[cur+1],   isDuplicate = false,  and write it into result set. 
if arr[cur]==arr[cur+1], 
     if (!isDuplicate)    isDuplicate = true; write it into result set,
     else ignore it.     

Space O(1), Time O(n).   


