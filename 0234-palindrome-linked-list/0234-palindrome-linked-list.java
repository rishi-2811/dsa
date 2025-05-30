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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
       
        ListNode m2=null;
       
        
        while(slow.next!=null){
            if(fast.next==null){
                m2=slow;
                break;
            }
            if(fast.next.next==null){
                m2=slow.next;
                break;
            }
            
                slow=slow.next;
                fast=fast.next.next;
                
                
        }
        
        
        
        
        ListNode end=reverseList(m2);
      
        ListNode temp1=head;
        ListNode temp2=end;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
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