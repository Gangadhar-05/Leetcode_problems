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
    public ListNode mergeNodes(ListNode head) {

        ListNode curr = head.next;
        ListNode temp = curr.next;

        while (temp != null) {

            if (temp.val != 0) {
                curr.val += temp.val;
                temp = temp.next;
            } else {
                if (temp.next == null) {
                    curr.next = null;
                    break;
                }

                curr.next = temp.next;
                curr = curr.next;
                temp = curr.next;   
            }
        }

        return head.next;
    }
}
