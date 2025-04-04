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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode Middle=findMiddle(head);
        ListNode lefthead=head;
        ListNode righthead=Middle.next;
        Middle.next=null;
        lefthead=sortList(lefthead);
        righthead=sortList(righthead);
        head=merge(lefthead,righthead);
        return head;
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode slowprev=null;
        ListNode fast=head;
         while(fast!=null && fast.next!=null){
                slowprev=slow;
                slow=slow.next;
                fast=fast.next.next;             
        }
       
        return slowprev;
    }
    public ListNode merge(ListNode lefthead,ListNode righthead){
        ListNode temp1=lefthead;
        ListNode temp2=righthead;
        ListNode head=null;
        if(temp1.val<=temp2.val){
            head=lefthead;
            temp1=temp1.next;
        }
        else{
            head=righthead;
            temp2=temp2.next;
        }
        ListNode temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        return head;
    }
}