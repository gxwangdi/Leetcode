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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = invertTree(root.right);
        newRoot.right = invertTree(root.left);
        return newRoot;
        // TreeNode newRoot = null;
        // if (root!= null) {
        //     newRoot = invertLeftRight(root);
        // }
        
        // if (newRoot != null) {
        //     newRoot.left = invertTree(newRoot.left);
        //     newRoot.right = invertTree(newRoot.right);
        // }
        // return newRoot;
    }
    
    // private TreeNode invertLeftRight(TreeNode node) {
    //     TreeNode left = null;
    //     TreeNode right = null;
        
    //     if (node.left!=null) {
    //         left = node.left;
    //     }
    //     if (node.right!=null) {
    //         right = node.right;
    //     }
    //     TreeNode newNode = new TreeNode(node.val);
    //     newNode.left = right;
    //     newNode.right = left;
    //     return newNode;
    // }// end of invertLeftRight      
}// end of Solution class   



