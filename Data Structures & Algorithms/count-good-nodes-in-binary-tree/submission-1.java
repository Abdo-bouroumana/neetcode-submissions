/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//  we gonna have a counter to count the number of nodes that satisfy the condition
//  also a priority queue to insert a node in it
// then we will look in what is the peek of the queue if it's the same node there is no nodes bigger in the path to that node
// base case: if a node is null --> return

class Solution {
    
    public int counterDFS(TreeNode root, int max){
        if(root == null) return 0;
        if(root.val >= max) max = root.val;
        
        int left = counterDFS(root.left, max);
        int right = counterDFS(root.right, max);

        if(root.val >= max) return left + right + 1;
        return left + right;
    }

    public int goodNodes(TreeNode root) {
        
        return counterDFS(root, root.val);
    }
}
