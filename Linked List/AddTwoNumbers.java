/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        ListNode prev = temp;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            }
            else if(l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(sum > 9) {
                carry = 1;
                sum = sum%10;
            }
            else {
                carry = 0;
            }
            temp.val = sum;
            temp.next = new ListNode(0);
            prev = temp;
            temp = temp.next;
        }
        if(carry > 0) {
            temp.val = carry;
        }
        else {
            prev.next = null;
        }
        return result;
    }
}