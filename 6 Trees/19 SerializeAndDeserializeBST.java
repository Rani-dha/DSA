// Program 19: Serialize and Deserialize BST
// https://leetcode.com/problems/serialize-and-deserialize-bst/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder serializeTree = new StringBuilder();
        dfs(root, serializeTree);
        return serializeTree.toString().trim();
    }
    void dfs(TreeNode node, StringBuilder sb){
        if( node ==  null) return;
        sb.append(node.val + " ");
        dfs(node.left, sb);
        dfs(node.right, sb);
    } 
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if( data.isEmpty()) return null;
        String s[] =  data.split(" ");
        return constructBST(s,0, s.length -1);
    }
    
    private TreeNode constructBST(String s[], int start, int end){
        if( start > end ) return null;
        TreeNode root = new TreeNode(Integer.parseInt(s[start]));
        int index;
        for(index = start; index <= end; index++){
            if( Integer.parseInt(s[index]) > Integer.parseInt(s[start]))
                break;
        }
        root.left = constructBST(s, start+1, index -1);
        root.right = constructBST( s, index,end);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
