/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        for  (ListNode head : lists) {
            if(head != null) {
                heap.offer(head);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!heap.isEmpty()) {
            ListNode smallest = heap.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                heap.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}