// Program 3: Binary Tree Zigzag Level Order Traversal(Spiral form)
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        List<Integer> level = new  List<>();
        Node current = root;
        s1.push(current);
        while( !s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node temp = s1.pop();
                level.add(temp.data);
                if( temp.right != null)
                    s2.push(temp.left);
                if( temp.left != null)
                    s2.push(temp.right);

            }
            if()
            while(!s2.isEmpty()){
                Node temp = s2.pop();
                result.add(temp.data);
                if( temp.left != null)
                    s1.push(temp.left);
                if( temp.right != null)
                    s1.push(temp.right);
            }
        }
        return result;
        
    }
}

// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[20,9],[15,7]]