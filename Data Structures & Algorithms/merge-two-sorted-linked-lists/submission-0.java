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
    // public ListNode minNode(ListNode node1, ListNode node2){
    //     if(node1 == null) {
    //         ListNode tmp = node2;
    //         node2 = node2.next;
    //         return tmp;
    //     }else if(node2 == null){
    //         ListNode tmp = node1;
    //         node1 = node1.next;
    //         return tmp;
    //     } if(node1.val > node2.val) {
    //         ListNode tmp = node2;
    //         node2 = node2.next;
    //         return tmp;
    //     }
    //     ListNode tmp = node1;
    //     node1 = node1.next;
    //     return tmp;
    // }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = null;
        ListNode head = null;
        while(list1 != null || list2 != null){
            if(resultList == null){
                if(list1 != null && list2 != null ){
                    if(list1.val > list2.val){
                        resultList = list2;
                        head = resultList;
                        list2 = list2.next;
                    }else{
                        resultList = list1;
                        head = resultList;
                        list1 = list1.next;
                    }
                }else if (list1 == null){
                    resultList = list2;
                    head = resultList;
                    list2 = list2.next;
                }else{
                    resultList = list1;
                    head = resultList;
                    list1 = list1.next;
                }
            }else{
                 if(list1 != null && list2 != null ){
                    if(list1.val > list2.val){
                        resultList.next = list2;
                        resultList = resultList.next;
                        list2 = list2.next;
                    }else{
                        resultList.next = list1;
                        resultList = resultList.next;
                        list1 = list1.next;
                    }
                }else if (list1 == null){
                    resultList.next = list2;
                    resultList = resultList.next;
                    list2 = list2.next;
                }else{
                    resultList.next = list1;
                    resultList = resultList.next;
                    list1 = list1.next;
                }
            }
        }
        return head;
    }
}