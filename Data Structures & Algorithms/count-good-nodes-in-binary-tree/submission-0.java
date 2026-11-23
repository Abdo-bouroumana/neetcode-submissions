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
    int count = 0;
    public void dfs(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }
}
