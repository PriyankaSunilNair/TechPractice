/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode right = start;
        ListNode left = start;
        for(int i=0; i<=n; i++) {
            if(right == null) {
                return null;
            }
            right = right.next;
        }
        while(right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return start.next;
    }
}