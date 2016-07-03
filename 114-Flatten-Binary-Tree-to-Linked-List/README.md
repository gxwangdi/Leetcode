This is a tree node after the changes, and it requires in-place, it is similar to http://www.lintcode.com/en/problem/convert-binary-search-tree-to-doubly-linked-list/.  

The iterative approach does not work for this problem.    
    

Time is O(n)

This is basically a DFS traversal sequence, for DFS recursion process, normally we pass in a List<Node> and add every single node we are visiting into the list, and create a linkedList based on the list at the end.  Space O(n).   

For in place solution, for each recursion call we will need to keep track of the last node in the nearest upper layer. And the question is like insert a node in a specified position for a linked list, but for this question, it is to insert a linked list into another linked list at specified position.  As per the example it looks like it only considers right child.      



  
