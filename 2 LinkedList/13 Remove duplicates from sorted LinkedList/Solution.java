// Program 13: Remove duplicates from sorted LinkedList
// https://www.hackerrank.com/challenges/30-linked-list-deletion/submissions/

public static Node removeDuplicates(Node head) {
    //Write your code here
  if( head == null) return null;
  
  Node temp = head;
  while(temp.next != null){
      if( temp.data == temp.next.data)
          temp.next = temp.next.next;                
      else 
         temp = temp.next;       
  }
  
  return head;
  }

