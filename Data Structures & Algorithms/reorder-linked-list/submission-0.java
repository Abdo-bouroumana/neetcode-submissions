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
    public void reorderList(ListNode head) {
        Map<Integer, ListNode> nodesIndexesMap = new HashMap<>();
        ListNode curr = head.next;
        int n = 1;
        while(curr != null){
            nodesIndexesMap.put(n, curr);
            n++;
            curr = curr.next;
        }
        curr = head;
        int i = 1;
        while(!nodesIndexesMap.isEmpty()){
            curr.next = nodesIndexesMap.get(n - i);
            nodesIndexesMap.remove(n - i);
            curr.next.next = null;
            if(!nodesIndexesMap.isEmpty()){
                curr.next.next = nodesIndexesMap.get(i);
                nodesIndexesMap.remove(i);
                curr = curr.next.next;
                curr.next = null;
            }
            i++;
        }
    }
}
