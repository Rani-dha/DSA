// Program 9: Reverse LinkedList in k- Groups
// https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode cur = dummy, nex = dummy, pre = dummy;
        
        while( cur.next != null){
            count++;
            cur = cur.next;
        }
        
        while( count >= k){
            cur = pre.next;
            nex = cur.next;
            
            for( int i=1; i<k; i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            count -= k;
        }
        
        return dummy.next;        
    }
}