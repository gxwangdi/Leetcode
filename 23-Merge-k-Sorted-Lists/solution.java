/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // Heap approach, put everything into a heap, and pop it to build a new list.
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, listComparator);
        for (ListNode n : lists) {
            while (n!=null) {
                heap.offer(n);
                n = n.next;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            cur.next = node;
            cur = cur.next;
        }
        cur.next = null;
        return dummy.next;
    }
    
    private Comparator<ListNode> listComparator = new Comparator<ListNode>(){
        public int compare(ListNode n1, ListNode n2) {
            if (n1 == null) {
                return 1;
            }
            if (n2 == null) {
                return -1;
            }
            return n1.val - n2.val;
        }
    };
}







