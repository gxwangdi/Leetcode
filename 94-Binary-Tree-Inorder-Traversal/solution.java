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
    
    // Iterative approach   
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p!=null || !stack.empty()) {
            while (p!=null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()) {
                p = stack.peek();
                res.add(p.val);
                stack.pop();
                p = p.right;
            }
        }
        return res;
    }
    
    
    /* // Recursive approach.  
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    
    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        } 
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }*/  
}


