// Check if LinkedList is palindrome or not
// https://leetcode.com/problems/palindrome-linked-list/submissions/


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
    public boolean isPalindrome(ListNode head) {
        
        if( head.next == null  || head  == null )
            return true;       
        
        // 1) Find the middle of the LinkedList    
        ListNode slow = head, fast = head;
        while( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }   
        
        // 2) Reverse the right half of LinkedList
        slow.next = reverseList( slow.next);
        
        slow = slow.next; // Move slow to right half        
        
        // 3) Checking the left half and right half of LinkedList are equal or not
        ListNode temp = head;
        while( slow != null){
            if( slow.val != temp.val)
                return false;
            temp = temp.next; 
            slow = slow.next;
        }
        return true;          
    }


    ListNode reverseList( ListNode head){

        ListNode pre = null, next = null;
        while( head != null ){
            ListNode nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return pre;
    }
}