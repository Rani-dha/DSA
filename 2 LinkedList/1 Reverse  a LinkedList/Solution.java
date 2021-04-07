// Program 1: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head == null)
            return null;
            
        //taking three pointers to store the current, previous and next nodes.
        Node prev = null;   
        Node current = head;
        Node next = current.next;
        
        while(current!=null)
        {
            //taking the next node as next.
            next=current.next;
            
            //storing the previous node in link part of current node.
            current.next=prev; 
            
            //updating prev from previous node to current node.
            prev=current; 
            
            //updating current node to next node.
            current =next;        
        }
        
        return prev; 
    }
}
