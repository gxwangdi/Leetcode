
For the definition of edit distance, check here:
https://leetcode.com/problems/edit-distance/   

set a min value,
min += abs(s.length - t.length)

min += char difference. 

min > 1, return false,
or return true;  

