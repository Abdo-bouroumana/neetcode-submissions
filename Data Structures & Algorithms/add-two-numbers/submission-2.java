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
            int opp = l1.val + l2.val + toAdd;
            if(opp >= 10){
                curr.next = new ListNode(opp - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(opp);
                toAdd = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1 != null){
            int opp = l1.val + toAdd;
            if(opp >= 10){
                curr.next = new ListNode(opp - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(opp);
                toAdd = 0;
            }
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null){
            int opp =l2.val + toAdd;
            if(opp >= 10){
                curr.next = new ListNode(opp - 10);
                toAdd = 1;
            }else{
                curr.next = new ListNode(opp);
                toAdd = 0;
            }
            l2 = l2.next;
            curr = curr.next;
        }
        if(toAdd == 1) curr.next = new ListNode(1);
        return dummy.next;


    }
}
