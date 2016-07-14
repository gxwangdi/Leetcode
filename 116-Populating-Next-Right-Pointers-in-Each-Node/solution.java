/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
        link(root, root);
    }
    
    public void link(TreeLinkNode left, TreeLinkNode right) {
        if (left == null || right == null) {
            return;
        }
        if (left == right) {
            link(left.left, right.right);
        } else {
            left.next = right;
            link(left.right, right.left);
            link(left, left);
            link(right, right);
        }
    }
}





