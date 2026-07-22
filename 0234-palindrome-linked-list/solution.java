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
     public ListNode middleNode(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        
    }
    return slow;
        
    }
      public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=head.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        
        return prev;
        
        
    }

    public boolean isPalindrome(ListNode head) {
        ListNode left=head;
        ListNode mid=middleNode(head);
        ListNode right=reverseList(mid);
        while(right!=null){
            if(left.val!=right.val)return false;
            else{
                left=left.next;
                right=right.next;
            }
        }
        return true;
    }
}
