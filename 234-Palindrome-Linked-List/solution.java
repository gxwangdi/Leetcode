/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /*
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sHead = slow.next;
        slow.next = null;
        
        // reverse sHead list.
        
        
        // compare head and sHead
        ListNode n1= head;
        ListNode n2=sHead;
        while (n1!=null && n2!=null) {
            if (n1.val != n2.val)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        if (n1==null && n2!=null || n1!=null && n2==null)
            return false;
        return true;
    }*/
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode cur = head;
        ListNode reverse = new ListNode(head.val); 
        
        while (cur.next!=null) {
            ListNode n = new ListNode(cur.next.val);   
            n.next = reverse;
            reverse = n;
            cur = cur.next;
        }
        
        cur = head;
        while (cur!=null) {
            if (cur.val != reverse.val)
                return false;
            cur = cur.next;
            reverse = reverse.next;
        }
        return true;
    }
}




