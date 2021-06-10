// Program 14: Top view of BT
// https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1/#

class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){node=n;hd=h;}
}

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(mp.containsKey(hd)==false)
                mp.put(hd,curr.data);
            if(curr.left!=null)
                q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new Pair(curr.right,hd+1));
        }
        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                result.add(x.getValue());//+" ");
        }
        return result;
        // add your code
        
    }
}

// Input:
//        10
//     /      \
//   20        30
//  /   \    /    \
// 40   60  90    100
// Output: 40 20 10 30 100
