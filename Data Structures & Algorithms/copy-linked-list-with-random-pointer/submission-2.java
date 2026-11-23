/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node newList = new Node(0);
        Node newListHead = newList;
        Map<Node, Integer> originalListNodesMap = new HashMap();
        Map<Integer, Node> newListNodesMap = new HashMap<>();
        int index = 0;
        while(curr != null){
            newListHead.next = new Node(curr.val);
            originalListNodesMap.put(curr, index);
            newListNodesMap.put(index, newListHead.next);
            index++;
            newListHead = newListHead.next;
            curr = curr.next;
        }
        newListHead = newList.next;
        curr = head;
        while(newListHead != null){
            if(curr.random != null ) newListHead.random = newListNodesMap.get(originalListNodesMap.get(curr.random));
            curr = curr.next;
            newListHead = newListHead.next;
        }

        return newList.next;

    }
}
