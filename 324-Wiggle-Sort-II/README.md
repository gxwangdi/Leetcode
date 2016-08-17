
I do not see any difference between this and WiggleSort......

Well, this could result in duplicate value, and only check/swap adjacent elements does not work.     

input:   [1,2,2,1,2,1,1,1,1,2,2,2]           
output: [1,2,1,2,1,2,1,1,1,2,2,2]                    
＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
One way is we can sort it first, and let i=1, j=len-1, switch nums[i] and nums[j], and i +=2, j-=2; until i>=j.   

Sorting takes O(nlogn), Space O(1)

