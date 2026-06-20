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

    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        
        

        ListNode h1=head;
        ListNode h2=reverseList(mid);

        while(h1!=null && h2!=null){
            ListNode temp=h1.next;
            h1.next=h2;
            h1=temp;

            temp=h2.next;
            h2.next=h1;
            h2=temp;
        }
        if(h1!=null){
            h1.next=null;
        }
        
        
    }
}
