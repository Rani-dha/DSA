//
//

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; // Copying the next's node value to the current node value.
        node.next = node.next.next;  // Point the node's next to  node's next next, bywhich you can remove the connection.           
    }
}