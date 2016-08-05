public class Solution {
    
    // DFS   
    public boolean validTree(int n, int[][] edges) {
        if (n < 1 || edges == null) {
            return false;
        }
        if (edges.length != n-1) {
            return false;
        }
        int[] visited = new int[n];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        if (hasCycle(-1, 0, adjList, visited)) {
            return false;
        }
        for (int v:visited) {
            if (v == 0) {
                return false;
            }
        }
        return true;
    }// end of validTree   
    
    private boolean hasCycle(int prev, int cur, List<List<Integer>> adj, int[] visited) {
        visited[cur] = 1;
        for (int succ : adj.get(cur)) {
            if (succ == prev) {
                continue;
            }
            if (visited[succ] == 1) {
                return true; // loop
            }
            if (visited[succ] == 0) {
                if (hasCycle(cur, succ, adj, visited)) {
                    return true;
                }
            }
        }// end of succ loop
        visited[cur] = 2;
        return false;
    }// end of hasCycle   
}





