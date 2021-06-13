// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?isFullScreen=true	

public static int height(Node root) {
      	// Write your code here.
          if(root == null) return -1;  // return -1 if root is not considered for height. If root is included in height then return 0
          return  1+ Math.max( height(root.left), height(root.right));
    }
