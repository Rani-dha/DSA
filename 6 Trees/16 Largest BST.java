// Largest BST from  BT
// https://practice.geeksforgeeks.org/problems/largest-bst/1#

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if( root == null) return 0;
        
        if( isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return size(root);
            
        return Math.max( largestBst(root.left) , largestBst(root.right));   
        
    }
    static int size(Node node){
        if( node == null) return 0;
        
        return 1+ size(node.left) + size(node.right);
    }
    static boolean isBST( Node node, int min, int max){
        if (node == null) return true;
        
        if(node.data < min || node.data > max)
            return false;
            
        return isBST( node.left, min, node.data-1) &&
                isBST(node.right, node.data+1, max);
    }
}
  