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
    public boolean hasCycle(ListNode head) {
        ListNode t = head;
        ListNode h = head;

        while (h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (t == h) {
                return true;
            }
        }

        return false;
    }
}
