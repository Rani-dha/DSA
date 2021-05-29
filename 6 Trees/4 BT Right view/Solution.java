// Program 4: BT Right view
// https://leetcode.com/problems/binary-tree-right-side-view/submissions/

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
     
        if( root == null)
            return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); 
        
        while( !q.isEmpty()){
            
            int size = q.size();
                       
            for(int i=0;i<size; i++){
                 TreeNode current = q.poll();
                 
                 if( i == size-1)
                    result.add(current.val);
                 
                 if( current.left != null )
                    q.add(current.left);
                 if(current.right != null)
                    q.add(current.right);
                
            }       
        }
        
        return result;           
        
    }
}

// Input: root = [1,2,3,null,5,null,4]
// Output: [1,3,4]