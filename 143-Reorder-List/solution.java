/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2!=null && p2.next!=null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        ListNode head2 = p1.next;
        p1.next = null;
        
        p2 = head2.next;
        head2.next = null;
        while (p2!=null) {
            p1 = p2.next;
            p2.next = head2;
            head2 = p2;
            p2 = p1;
        }
        p1 = head; 
        p2 = head2;
        while (p1!=null) {
            ListNode temp = p1.next;
            p1 = p1.next = p2;
            p2 = temp;
        }
    }// end of reorderList
}



