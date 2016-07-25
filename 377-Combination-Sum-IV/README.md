
Recursive approach.     

for each recursion, there is a resultset, a progress, and target.   

for each element e in nums, 
if target - e > 0,  go to next step as  progress+e,  target-e, 
if target - e == 0, put progress + e into result set.
if target -e < 0, dump! 

