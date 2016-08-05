
I would think of this as a graph topology sort problem.  

use a map<Character key, Set<Character> value> to indicate the dependency, where chars in value are all chars that appear behind key.  

After comparing adjacent two words continuously, build the map, and take all keys in the map to sort, like insertion sort.   

