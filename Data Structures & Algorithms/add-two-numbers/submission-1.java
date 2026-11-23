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
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int toAdd = 0;
        while(l1 != null && l2 != null){
            if(l1.val + l2.val + toAdd >= 10){
                curr.next = new ListNode(l1.val + l2.val + toAdd - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(l1.val + l2.val + toAdd);
                toAdd = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1 != null){
            if(l1.val + toAdd >= 10){
                curr.next = new ListNode(l1.val + toAdd - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(l1.val + toAdd);
                toAdd = 0;
            }
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null){
            if(l2.val + toAdd >= 10){
                curr.next = new ListNode(l2.val + toAdd - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(l2.val + toAdd);
                toAdd = 0;
            }
            l2 = l2.next;
            curr = curr.next;
        }
        if(toAdd == 1) curr.next = new ListNode(1);
        return dummy.next;


    }
}
