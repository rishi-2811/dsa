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
        if(head.next==null){
            return head;
        }
        ListNode turtle=head;
        ListNode hare=head;
        while(turtle.next!=null){
            if(hare.next==null){
                return turtle;
            }
            else if(hare.next.next==null){
                return turtle.next;
            }
            else{
                hare=hare.next.next;
                turtle=turtle.next;
            }
        }
        return turtle;
    }
}