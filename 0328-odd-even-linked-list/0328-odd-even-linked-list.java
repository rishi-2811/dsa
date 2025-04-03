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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(head.next.next==null){
            return head;
        }
        ListNode temp1=head,temp2=head.next;
        while(temp2!=null && temp2.next!=null){
            ListNode front=temp2.next;
            ListNode front2=front.next;
            
            front.next=temp1.next;
            temp1.next=front;
            temp2.next=front2;
            temp2=temp2.next;
            temp1=temp1.next;
           
        }
        return head;
    }
}