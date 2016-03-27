/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode node3 = head.next.next; 
        
        node1.next = null;
        node2.next = node1;
        while (node3 != null) {
            node1 = node2;
            node2 = node3;
            node3 = node3.next;
            node2.next = node1;
        }
        
        return node2;
    }// end of reverseList      
}