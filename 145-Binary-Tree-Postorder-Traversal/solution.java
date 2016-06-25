/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    
    private static class Pair {
        public TreeNode node;
        public boolean visited;
        public Pair(TreeNode tn, boolean v) {
            node = tn;
            visited = v;
        }
    }
    
    
    // Iterative manner.        
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TempNode> stack = new Stack<>();
        TreeNode node = root;
        TempNode temp;
        while (node!=null || !stack.empty()) {
            while (node != null) {
                temp = new TempNode(node, true);
                stack.push(temp);
                node = node.left;
            }
            if (!stack.empty()) {
                temp = stack.pop();
                if (temp.isFirst) {
                    temp.isFirst = false;
                    stack.push(temp);
                    node = temp.node.right;
                } else {
                    res.add(temp.node.val);
                    node = null;
                }
            }
        }
        return res;
    }
    
    private static class TempNode {
        public TreeNode node;
        public boolean isFirst;
        public TempNode (TreeNode tn, boolean first) {
            node = tn;
            isFirst = first;
        }
    }
    
    
    /* // recursive manner  
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    
    private void postorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }*/  
    
}



