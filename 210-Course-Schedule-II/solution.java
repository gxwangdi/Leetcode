public class Solution {
    
    // My implementation does not work for now, as there could be duplicate dependency like [1,9] [1,9], and set removes duplicates.
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        if (prerequisites == null || prerequisites.length == 0) {
            for (int i=0; i<numCourses; i++) {
                res[i] = i;
            }
            return res;
        }
        // List<Set<Integer>> graph = new ArrayList<>(numCourses);
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        // Set<Integer>[] graph = new HashSet<Integer>[numCourses];
        int[] count = new int[numCourses];
        
        for (int i=0; i<numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre: prerequisites) {
            count[pre[0]] ++;
            graph.get(pre[1]).add(pre[0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<numCourses; i++) {
            if (count[i] == 0) {
                queue.offer(i);
            }
        }
        int cur = 0;
        while (!queue.isEmpty()) {
            int from = queue.poll();
            res[cur++] = from;
            for (int to : graph.get(from)) {
                count[to]--;
                if (count[to] == 0) {
                    queue.offer(to);
                }
            }
        }
        if (cur == numCourses) {
            return res;
        }
        return new int[0];
    }
    
    
    /*
    // My implementation using set to indicate dependency, TLE. 
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        if (prerequisites == null || prerequisites.length == 0) {
            for (int i=0; i<numCourses; i++) {
                res[i] = i;
            }
            return res;
        }
        // int[] degree = new int[numCourses];
        Map<Integer, Set<Integer>> edges = new HashMap<>();
        for (int i=0; i<numCourses; i++) {
            edges.put(i, new HashSet<Integer>());
        }
        for (int[] pre : prerequisites) {
            edges.get(pre[0]).add(pre[1]);
        }
        int cur = 0;
        Queue<Integer> q = new LinkedList<>();
        for (Integer key : edges.keySet()) {
            if (edges.get(key).size() == 0) {
                q.offer(key);
            }
        }
        while (!q.isEmpty()) {
            int course = q.poll();
            // Add to result set.
            res[cur++] = course;
            // Scan and remove cur in edges.
            for (Integer key : edges.keySet()) {
                Set<Integer> set = edges.get(key);
                if (!set.contains(course)) {
                    continue;
                }
                set.remove(course);
                if (set.size()==0) {
                    q.offer(key);
                }
            }
        }
        if (cur < numCourses) { // there is cycle
            return new int[0];
        }
        return res;
    }
    */
}





