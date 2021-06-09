// Program 10: Deepest Leaves Sum BT
// https://leetcode.com/problems/deepest-leaves-sum/

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
    int sum = 0;
    int maxDepth = 0;
    public int deepestLeavesSum(TreeNode root) {
        findSum(root,1);
        return sum;   
    }
    public void findSum( TreeNode node, int curr){
        if( node != null){
            if(curr > maxDepth){
                sum = 0;
                maxDepth = curr;
            }
            if(curr == maxDepth)
                sum+= node.val;
            
            findSum(node.left, curr+1);
            findSum(node.right, curr+1);            
        }
    }
}

// Example 1:
// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
// Output: 15
// Example 2:

// Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
// Output: 19

