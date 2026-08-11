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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode curr = head;
        while (l1 != null || l2  != null || carry != 0) {
            int v1;
            int v2;
            v1 = (l1 != null) ? l1.val : 0;
            v2 = (l2 != null) ? l2.val : 0;
            int v3 = v1 + v2 + carry;
            carry = 0;
            if (v3 > 9) {
                v3 = v3-10;
                carry = 1;
            }
            curr.next = new ListNode(v3);
            curr = curr.next;
            if (l1 != null) { l1 = (l1.next != null) ? l1.next : null; }
            if (l2 != null) { l2 = (l2.next != null) ? l2.next : null; }
        }
        return head.next;
    }
}
