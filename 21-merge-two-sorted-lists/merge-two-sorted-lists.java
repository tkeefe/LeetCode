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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(-1);
        ListNode startingNode = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                startingNode.next = list1;
                list1 = list1.next;
            } else {
                startingNode.next = list2;
                list2 = list2.next;
            }
                startingNode = startingNode.next;
        }

        if (list1 != null) {
            startingNode.next = list1;
        } else {
            startingNode.next = list2;
        }

        return newNode.next;

    }
}