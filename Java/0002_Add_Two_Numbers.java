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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode summedList = new ListNode(0, null);            // create new linked list for return
        ListNode head = summedList;                             // copy linked list but same reference
        int carry = 0;
        int sum = 0;

        while(l1!=null || l2!=null || sum>0) {                  // while input linked-lists are not at the tails or sum is bigger than 0
            if(l1 != null) {                                    // if input linked list l1 is not at the tail
                sum += l1.val;                                  // add to sum
                l1 = l1.next;                                   // and go to next node
            }
            if(l2 != null) {                                    // if input linked list l2 is not at the tail
                sum += l2.val;                                  // add to sum
                l2 = l2.next;                                   // and go to next node
            }
            if(sum >= 10) {                                     // if sum is greater than or equal to 10
                carry = sum / 10;                               // create carry
                sum = sum % 10;                                 // and leave last digit only
            }
            head.next = new ListNode(sum, null);                // create new node with last digit and connect to head
            head = head.next;                                   // to repeat this process, head should be head.next
                                                                // otherwise it will overwrite second node
            sum = carry;
            carry = 0;
        }
        return summedList.next;                                 // return next node of summedList because it starts with 0
    }
}
