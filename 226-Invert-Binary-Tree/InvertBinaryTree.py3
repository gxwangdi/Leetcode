# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        if root == None :
            return root
        queue = [root]
        while len(queue) != 0 :
            queue[0].left, queue[0].right = queue[0].right, queue[0].left
            if queue[0].left :
                queue.append(queue[0].left)
            if queue[0].right :
                queue.append(queue[0].right)
            del queue[0]
        return root
        
