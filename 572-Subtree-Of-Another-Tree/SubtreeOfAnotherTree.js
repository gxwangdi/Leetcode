/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} s
 * @param {TreeNode} t
 * @return {boolean}
 */
var isSubtree = function(s, t) {
    var isSameTree = function(s, t) {
        if (!s && !t) {
            return true
        }
        if (!s || !t) {
            return false
        }
        if (s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right)
    }
    if (isSameTree(s,t)) {
        return true
    }
    if (s == null) {
        return false
    }
    return isSubtree(s.left, t) || isSubtree(s.right, t)
};
