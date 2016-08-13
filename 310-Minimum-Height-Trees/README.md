A brute force approach would be:  

Build the graph in a map,
Start from each node, BFS and store <nodeLabel, depth>, into a max heap,  
and get the top until depth is different.     


