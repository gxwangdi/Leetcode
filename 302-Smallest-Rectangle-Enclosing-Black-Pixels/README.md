
Basically prepare two segments, row and column marked by low and high, initiated as x, y respectively.    

And doing a BFS, when expanding to a new node, adjust lowR/lowC/highR/highC accordingly.   

So the answer would be   (highR-lowR+1) * (highC-lowC+1).         

The thing is, if there is only one black region, why I need to start from given <x,y>?   

