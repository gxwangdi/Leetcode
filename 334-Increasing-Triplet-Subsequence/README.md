
Initially set count as 1,   pivot as nums[0]    cur pointer starts from 1.  

if pivot < cur    count++, and if count == 3, return true;
if pivot > cur   pivot = cur, count =1;

return false if after a one round scanning. 