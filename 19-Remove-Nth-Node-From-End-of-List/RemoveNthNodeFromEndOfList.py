# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        if head==None or n<0 :
            return None
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        target = head
        tail = head
        i = 0
        while i<n and tail!=None:
            tail = tail.next
            i+=1
        while tail!=None:
            tail = tail.next
            target = target.next
            prev = prev.next
        prev.next = target.next
        return dummy.next
    
    

