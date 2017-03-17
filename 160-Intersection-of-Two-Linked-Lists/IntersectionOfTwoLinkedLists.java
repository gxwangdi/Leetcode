/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (curA!=null) {
            curA = curA.next;
            lengthA++;
        }
        while (curB!=null) {
            curB = curB.next;
            lengthB++;
        }
        ListNode llist;
        ListNode slist;
        if (lengthA >= lengthB) {
            llist = headA;
            slist = headB;
        } else {
            llist = headB;
            slist = headA;
        }
        int dis = Math.abs(lengthA - lengthB);
        for (int i=0; i<dis; i++) {
            llist = llist.next;
        }
        
        while (llist != slist) {
            llist = llist.next;
            slist = slist.next;
        }
        return llist;
    }
}