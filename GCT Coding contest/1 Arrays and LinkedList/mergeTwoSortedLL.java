// Merge two sorted linked list
// https://www.hackerrank.com/contests/gct-c/challenges/merge-two-sorted-linked-lists/submissions/code/1334067610

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if( head1 == null) return head2;
        if( head2 == null) return head1;
        
        if(head1.data > head2.data){
            SinglyLinkedListNode  temp = head1;
            head1 = head2;
            head2 = temp;
        }
        SinglyLinkedListNode result = head1;
        while( head1 != null && head2 != null){
            SinglyLinkedListNode prevNode = null;
            while ( head1 != null && head1.data <= head2.data){
                prevNode = head1;
                head1 = head1.next;
            }
            
            prevNode.next = head2 ;
            
            SinglyLinkedListNode swap = head1;
            head1 = head2;
            head2 = swap;           
            
        }
        return result;

    }

    // LL1: 1 2  3  
    // LL2: 3 4
    // Output: 1 2 3 3 4
