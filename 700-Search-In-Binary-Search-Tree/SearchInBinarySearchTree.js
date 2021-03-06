/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var searchBST = function(root, val) {
    var cur = root
    while (cur) {
        if (cur.val == val) {
            break
        }
        if (cur.val > val) {
            cur = cur.left
            continue
        }
        cur = cur.right
    }
    return cur
};
