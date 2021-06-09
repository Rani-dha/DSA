// Validate Bt is BST or not
// https://leetcode.com/problems/validate-binary-search-tree/submissions/

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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double leftChildVal = - Double.MAX_VALUE; 
        // Don't change to Integer you will  wrong output.
        // Note: left var is primitive double and on right side it is non- primitive  Double. It also can be long leftChildVal = Long.MAX_VALUE.
        
        while( ! stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            if( root.val <= leftChildVal) return false;
            leftChildVal = root.val;
            root = root.right;                
        }
        
        return true;
    }
}


/*
public boolean isValidBST(TreeNode root) {
        
        
    TreeNode curr = root;
    TreeNode prev = null;
    
    while (curr != null) {
        if ( prev == null && curr.left != null) {
            root = curr.left;
            curr.left = curr.left.right;
            root.right = curr;
            curr = root;
        }
        else if (curr.left != null) {
            prev.right = curr.left;
            curr.left = curr.left.right;
            prev.right.right = curr;
            curr = prev.right;
        }
        else {
            if (prev != null && prev.val >= curr.val)
                return false;
            
            prev = curr;
            curr = curr.right;
        }
    }
    
    return true;
} */


// Input: root = [5,1,4,null,null,3,6]
// Output: false
// Explanation: The root node's value is 5 but its right child's value is 4.