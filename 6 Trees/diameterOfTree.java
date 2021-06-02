// https://leetcode.com/problems/diameter-of-binary-tree/submissions/

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
class Solution {
    int diameter = Integer.MIN_VALUE;
    private int height(TreeNode root){
        if( root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height( root.right);
        
        diameter = Math.max( diameter, leftHeight + rightHeight );
        return 1 + Math.max( leftHeight, rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
      if( root == null) return 0;
      height( root);
      return diameter;       
   }
}
