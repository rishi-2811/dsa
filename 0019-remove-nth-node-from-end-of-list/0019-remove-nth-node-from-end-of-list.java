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
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        int count=0;
        ListNode temp3=null,temp1=head,temp2=head;
        while(temp2!=null){
            while(count!=n){
                temp2=temp2.next;
                count++;
            }
            if(temp2==null){
                break;
            }
            temp3=temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1.next==null){
            temp3.next=null;
        }
        else{
            temp1.val=temp1.next.val;
            temp1.next=temp1.next.next;
        }
        return head;
    }
}