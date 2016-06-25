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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, false));
        TreeNode node;
        boolean visited;
        while (!stack.empty()) {
            node = stack.peek().node;
            visited = stack.peek().visited;
            stack.pop();
            if (node == null) {
                continue;
            }
            if (visited) {
                res.add(node.val);
            } else {
                stack.push(new Pair(node.right, false));
                stack.push(new Pair(node.left, false));
                stack.push(new Pair(node, true));
            }
        }
        return res;
    }
    
    private static class Pair {
        public TreeNode node;
        public boolean visited;
        public Pair(TreeNode tn, boolean v) {
            node = tn;
            visited = v;
        }
    }
    
    
    /* // iterative manner
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node!=null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            if (!stack.empty()) {
                node = stack.pop();
                node = node.right;
            }
        }
        return res;
    }*/ 
    
    
    /* // recursive manner   
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    
    private void preorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }*/     
}




