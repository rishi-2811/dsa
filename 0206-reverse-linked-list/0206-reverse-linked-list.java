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
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode temp=head;
        ListNode front=head.next;
        while(temp!=null){
            if(prev==null){
                prev=temp;
                temp=temp.next;
                front=front.next;
            }
            
            else{
                temp.next=prev;
               
                prev=temp;
                
                temp=front;
                front=front==null?null:front.next;
            }
        }
        head.next=null;
        return prev;
    }
}