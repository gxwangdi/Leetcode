
Based on solution for word search, we cannot use a whole boolean[][] array to indicate available cells, as it is just over space consuming.   

We might, on the other hand, use a set<<i,j>> to record available cells for one word.  

Now it has an issue like it can not handle duplicate access on board. No time to fix it. 
==============================================
Reference the most popular posting in discuss

https://discuss.leetcode.com/topic/33246/java-15ms-easiest-solution-100-00/2

Grab all strings into a trie, and visit all cells in the matrix.  Put it as 'X' to avoid duplicate visit.  When visiting something, check if there is a leaf node inside trie.  

  
 

