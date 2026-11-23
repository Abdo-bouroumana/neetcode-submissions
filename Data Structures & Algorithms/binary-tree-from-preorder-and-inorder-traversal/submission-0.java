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

// find the root in the preorder Traversal (first element)
// find left & right subtrees elements in the inorder Traversal
// repeat same think with left and right elements of that node in the inorder Traversal


class Solution {
    public int findRoot(int[] preorder, int[] inorder, int i, int j){
        Set<Integer> inorderElements = new HashSet<>();
        for(int l = i; l <= j; l++ ){
            inorderElements.add(inorder[l]);
        }
        int k;
        for(k = 0; k < preorder.length; k++){
            if(inorderElements.contains(preorder[k])) break; 
        } 
        int index = -1;
        for(int l = i; l <= j; l++ ){
            if(inorder[l] == preorder[k]) {index = l;break;}
        }
        return index;
    }

    public TreeNode recursiveBT(int[] preorder, int[] inorder, int i, int j){
        if (i > j) return null;
        if(i == j) return new TreeNode(inorder[i]);
        int rootIndex = findRoot(preorder, inorder, i, j);
        TreeNode node = new TreeNode(inorder[rootIndex]);
        node.left = recursiveBT(preorder, inorder, i, rootIndex - 1);
        node.right = recursiveBT(preorder, inorder, rootIndex + 1, j);
        return node;

    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recursiveBT(preorder, inorder, 0, inorder.length - 1);
    }
}
