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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null || head.next==null){
        return null;
    }
        int length=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        length++;
    }
    int range=length-n;
    if(range == 0){
    return head.next;
}
    ListNode prev=null;
    ListNode curr=head;
    for(int i=0;i<range;i++){
        prev=curr;
        curr=curr.next;
    }
    prev.next=curr.next;
    return head;

    }
   
}
