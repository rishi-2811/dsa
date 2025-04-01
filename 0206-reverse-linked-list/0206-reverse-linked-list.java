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
        
        
        return reverse(head,null);
    }
    public ListNode reverse(ListNode temp,ListNode prev){
        if(temp==null){
            return prev;
        }
        else{
            ListNode front=temp.next;
            temp.next=prev;
            return reverse(front,temp);
        }
    }
}