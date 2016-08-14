
we can detect cycle first, and add nodes one by one based on in-degree.   

Or we can use an array to indicate which node is added into result set.   During the process, if we find cycle, or find some node candidates that are already added into result set, then return empty list.   
=======================================
Get an TLE. Firstly, we can use an array to replace the map, as the key is sequential, 
 
Need to understand the dependency matrix quickly ! ! ! ! And design proper structure to help speed up the checking dependency process.  This is the key !  

 
