
Define a struct Result, has found and val.   

If found is true, then val is the value of kth smallest node;
If found is false, then val is the total amount of nodes in the subtree.  

root node check left subtree, 
if found, pass back, if not,  if k==1 pass itself, or  query right subtree updating k as k-left.val-1;
If found in right subtree, pass back, if not, pass (false, left.val+1+right.val).   

Space O (logn)   Time O(k), as we query one by one until we find the kth node.  

    