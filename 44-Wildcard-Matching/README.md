
match it in recursive manner, that is easier to implement.  

if both s and p reach the end at the same time,  return true;

if either one reaches the end, return false;

if i == j or j == '?',  check (s, i+1,  p, j+1)  

if j == '*',  check (s, i+1, p, j+1) || (s, i+1, p, j)  

else  return false;

