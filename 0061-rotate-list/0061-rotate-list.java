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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
       
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        System.out.println(k);
        if(k==0){
            return head;
        }
        if(length==2){
            temp=head.next;
            temp.next=head;
            head.next=null;
            return temp;
        }
        int count=1;
        ListNode temp3=null,temp1=head,temp2=head;
        while(temp2!=null){
            while(count<=k+1){
                temp2=temp2.next;
                count++;
            }
            if(temp2==null){
                temp3=temp;
                break;
            }
            temp3=temp2;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        ListNode newHead=temp1.next;
        temp1.next=null;
        temp3.next=head;
        return newHead;
    }
}