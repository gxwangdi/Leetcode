
we can detect cycle first, and add nodes one by one based on in-degree.   

Or we can use an array to indicate which node is added into result set.   During the process, if we find cycle, or find some node candidates that are already added into result set, then return empty list.   

 

