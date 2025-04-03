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
    public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || head.next == null || k == 1) {
        return head;
    }
    
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prevHead = dummy;
    ListNode temp = head;
    
    while (temp != null) {
        ListNode tail = getTail(temp, k);
        if (tail == null) {
            break;
        }
        
        ListNode next = tail.next;
        ListNode reversedHead = reverseList(temp, tail);
        
        prevHead.next = reversedHead;
        temp.next = next;
        
        prevHead = temp;
        temp = next;
    }
    
    return dummy.next;
}

public ListNode reverseList(ListNode head, ListNode tail) {
    
    if (tail == null) {
        return head;
    }
    
    ListNode prev = null;
    ListNode temp = head;
    ListNode next = null;
    ListNode stopNode = tail.next;
    
    while (temp != stopNode) {
        next = temp.next;
        temp.next = prev;
        prev = temp;
        temp = next;
    }
    
    return prev;
}

public ListNode getTail(ListNode head, int k) {
    if (head == null) {
        return null;
    }
    
    ListNode temp = head;
    int count = 1;
    
    while (count < k && temp != null) {
        temp = temp.next;
        count++;
    }
    
    return (count == k) ? temp : null;
}
}