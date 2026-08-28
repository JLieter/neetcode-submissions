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
        HashSet<ListNode> arr = new HashSet();

        while (head != null) {
            if (arr.contains(head)) {
                return true;
            }
            arr.add(head);
            head = head.next;
        }
        return false;
    }
}
