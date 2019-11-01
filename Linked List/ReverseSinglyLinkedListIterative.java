/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode present = head;
        ListNode prev = null;
        while(present != null) {
            ListNode temp = present.next;
            present.next = prev;
            prev = present;
            present = temp;
        }
        return prev;
    }
}