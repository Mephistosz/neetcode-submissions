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
    public ListNode reverseList(ListNode head) {
        ListNode lastValue = null;
        ListNode node = null;

        while (head != null) {
            node = head.next;
            head.next = lastValue;
            lastValue = head;
            head = node;
        }

        return lastValue;
    }
}
