/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        if(head.next==head){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next==null?null:fast.next.next;
            if(slow==fast){
                if(slow.next.next==slow){
                    return slow;
                }
                if(slow==head){
                    return head;
                }
                slow=head;
                while(true){
                    fast=fast.next;
                    slow=slow.next;
                    if(slow==fast){
                        return slow;
                    }
                }
            }
        }
        return null;
    }
    
}