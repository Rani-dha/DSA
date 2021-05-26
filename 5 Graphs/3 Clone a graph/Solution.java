// Program 3: Clone a graph
// https://leetcode.com/problems/clone-graph/submissions/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {     
       
        if( node == null) return node;
        
        Node newNode = new Node(node.val);
        map.put(node, newNode);
        
        for(Node n : node.neighbors){
            if( map.containsKey(n))
                newNode.neighbors.add(map.get(n));
            
            else
                newNode.neighbors.add(cloneGraph(n));
       }
        return newNode;                
    }
}


// Your input
// [[2,4],[1,3],[2,4],[1,3]]
// Output
// [[2,4],[1,3],[2,4],[1,3]]
// Expected
// [[2,4],[1,3],[2,4],[1,3]]