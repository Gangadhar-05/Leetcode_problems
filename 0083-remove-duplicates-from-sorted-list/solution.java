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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode temp = head;
        int val = curr.val;

        while (temp.next != null) {

            if (temp.next.val != val) {
                curr.next = temp.next;
                curr = temp.next;
                temp = temp.next;
                val = curr.val;
            } else {
                temp = temp.next;
            }
        }

        curr.next = null;

        return head;
    }
}
