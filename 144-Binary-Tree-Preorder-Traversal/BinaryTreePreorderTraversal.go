/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func preorderTraversal(root *TreeNode) []int {
	res := make([]int, 0)
	cur := root
	for cur != nil {
		if cur.Left == nil {
			res = append(res, cur.Val)
			cur = cur.Right
			continue
		}
		prev := cur.Left
		for prev.Right != nil && prev.Right != cur {
			prev = prev.Right
		}
		if prev.Right == nil {
			res = append(res, cur.Val)
			prev.Right, cur = cur, cur.Left
		} else {
			prev.Right, cur = nil, cur.Right
		}
	}
	return res
}
