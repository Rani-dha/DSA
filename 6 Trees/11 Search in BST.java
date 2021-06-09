// Search in BST
// /**
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root ==  null) return null;
        if( root.val == val) return root;
        
        if( val < root.val )
            return searchBST( root.left, val);
        else  // if( val > root.val) if you put if with condition then you have to return null below the else.
            return searchBST( root.right, val);
    }
}

// Input: root = [4,2,7,1,3], val = 5
// Output: []