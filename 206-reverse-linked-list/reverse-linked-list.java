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
    public ListNode reverseList(ListNode head) {
          if (head == null) return null;
        
        ListNode[] newHeadContainer = new ListNode[1];
        
        reverseListUsingRecursion(head, newHeadContainer).next = null;
        
        return newHeadContainer[0];
    }
    
    
    private ListNode reverseListUsingRecursion(ListNode curNode, ListNode[] headContainer) {
        
        if (curNode.next == null) return headContainer[0] = curNode;
        
        reverseListUsingRecursion(curNode.next, headContainer).next = curNode;
        
        return curNode;
    }
}