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
    
    // Recursive approach
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        // TreeNode newRoot = new TreeNode(root.val);
        // newRoot.left = invertTree(root.right);
        // newRoot.right = invertTree(root.left);
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}// end of Solution class   



