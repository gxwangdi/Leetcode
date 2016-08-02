
Use a map<String, List<String>> to persist the <from, to> mappings, and for all values inside the map, sort all the values in the map so that they are all in lex order.   

Start from JFK, for each iteration,  get the dst in the value list, and remove the dst from the value list, and add the dst to result set, set as the starting point for next iteration.   

Space O(n), Time O(n).    

