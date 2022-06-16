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
//	public static class ListNode {
//		int val;
//	 	ListNode next;
//	 	ListNode() {}
//	 	ListNode(int val) { this.val = val; }
//		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
	
//	public static void main(String[] args) {
//		
//		// Example 1, output: [7,0,8]
//		ListNode linked1 = new ListNode(2);
//		ListNode head1 = linked1;
//		head1.next = new ListNode(4);
//		head1 = head1.next;
//		head1.next = new ListNode(3, null);
//		
//		ListNode linked2 = new ListNode(5);
//		ListNode head2 = linked2;
//		head2.next = new ListNode(6);
//		head2 = head2.next;
//		head2.next = new ListNode(4, null);
//		
//		ListNode example1 = addTwoNumbers(linked1, linked2);
//		printLinked(example1);
//		
//		
//		// Example 2, output: [0]
//		ListNode linked3 = new ListNode(0, null);
//		
//		ListNode linked4 = new ListNode(0, null);
//		
//		ListNode example2 = addTwoNumbers(linked3, linked4);
//		printLinked(example2);
//		
//		
//		// Example 3, output: [8,9,9,9,0,0,0,1]
//		ListNode linked5 = new ListNode(9);
//		ListNode head5 = linked5;
//		head5.next = new ListNode(9);
//		head5 = head5.next;
//		head5.next = new ListNode(9);
//		head5 = head5.next;
//		head5.next = new ListNode(9);
//		head5 = head5.next;
//		head5.next = new ListNode(9);
//		head5 = head5.next;
//		head5.next = new ListNode(9);
//		head5 = head5.next;
//		head5.next = new ListNode(9, null);
//		
//		ListNode linked6 = new ListNode(9);
//		ListNode head6 = linked6;
//		head6.next = new ListNode(9);
//		head6 = head6.next;
//		head6.next = new ListNode(9);
//		head6 = head6.next;
//		head6.next = new ListNode(9, null);
//		
//		ListNode example3 = addTwoNumbers(linked5, linked6);
//		printLinked(example3);
//	}
//	
//	// linked list print method
//	public static void printLinked(ListNode linked) {
//		System.out.printf("[");
//		while(linked.next != null) {
//			System.out.printf("%d,", linked.val);
//			linked = linked.next;
//		} 
//		System.out.println(linked.val + "]");
//	}
	
}
