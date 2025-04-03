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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null && temp2!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1==null){
            return add(l2,l1);
        }
        else{
            return add(l1,l2);
        }
    }
    public ListNode add(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1.next!=null ){
           if(temp2==null){
             if(temp1.val+carry>=10){
                temp1.val=(temp1.val+carry)%10;
                carry=1;
             }
             else{
                temp1.val+=carry;
                carry=0;
             }
             temp1=temp1.next;
           }
           else{
             if(temp1.val+temp2.val+carry>=10){
                temp1.val=(temp1.val+temp2.val+carry)%10;
                carry=1;
             }
             else{
                temp1.val+=temp2.val+carry;
                carry=0;
             }
             temp1=temp1.next;
             temp2=temp2.next;
           }
        }
        if(temp2==null){
            if(temp1.val+carry>=10){
                temp1.val=(temp1.val+carry)%10;
                temp1.next=new ListNode(1);
             }
             else{
                temp1.val+=carry;
                carry=0;
             }
        }
        else{
            if(temp1.val+temp2.val+carry>=10){
                temp1.val=(temp1.val+temp2.val+carry)%10;
                temp1.next=new ListNode(1);
             }
             else{
                temp1.val+=temp2.val+carry;
                carry=0;
             }
        }
        return l1;
    }
}