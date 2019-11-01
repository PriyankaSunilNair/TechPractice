/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        else if(l1 == null) {
            return l2;
        }
        else if(l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode finalResult = result;
        ListNode prev = null;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                result.val = l1.val;
                l1 = l1.next;
            }
            else {
                result.val = l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(0);
            prev = result;
            result = result.next;
        }
        while(l1 != null) {
            result.val = l1.val;
            l1 = l1.next;
            result.next = new ListNode(0);
            prev = result;
            result = result.next;
        }
        while(l2 != null) {
            result.val = l2.val;
            l2 = l2.next;
            result.next = new ListNode(0);
            prev = result;
            result = result.next;
        }
        prev.next = null;
        return finalResult;
    }
}