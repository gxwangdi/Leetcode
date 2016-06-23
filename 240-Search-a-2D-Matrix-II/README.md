
This is really, really binary search after binary search.    

1. BSearch first column, get the lowest position that matrix[i][0] <target;   
2. In rows j = 0~i, get the lowest position that matrix[j][matrix[j].length-1]<target;
3. for rows k = (j+1)~i, do binary search for target.   

Space O(1)   Time O(logmlogn)     

  