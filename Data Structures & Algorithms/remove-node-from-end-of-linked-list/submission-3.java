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
        ListNode front = head;
        ListNode back = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0; i < n; i++){
            front = front.next;
        }
        while(front != null){
            front = front.next;
            prev = back;
            back = back.next;
        }

        prev.next = back.next;

        // if(prev != null){
        //     prev.next = back.next;
        // }else{
        //     head = back.next;
        // }
        return dummy.next;
    }
}
