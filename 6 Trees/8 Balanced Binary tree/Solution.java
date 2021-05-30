// Program 8: Balanced BT
// https://leetcode.com/problems/balanced-binary-tree/submissions/

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
    public boolean isBalanced(TreeNode root) {
     if(root == null ) return true;
     return height(root) != -1;
    }
    
    public int height(TreeNode node){
        if(node == null ) return 0;
        int left = height(node.left);
        int right = height(node.right);
        int balance = Math.abs(left-right);
        
        if(balance > 1 || left == -1 || right == -1)  return -1;
        return 1+ Math.max(left, right);
    }
}

// Input: root = [3,9,20,null,null,15,7]
// Output: true

// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false