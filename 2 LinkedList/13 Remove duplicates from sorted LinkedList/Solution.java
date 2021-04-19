// Program 13:
//

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

