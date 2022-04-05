/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let summedList = new ListNode(0, null);                 // create new linked list to return the sum of two input linked-lists
    let head = summedList;                                  // copy linked list but same reference
    let sum = 0;
    let carry = 0;

    while(l1 !== null || l2 !== null || sum > 0) {          // if input linked-lists are not at the tails or sum is bigger than 0
        if(l1 !== null) {                                   // if input linked list l1 is not at the tail
            sum += l1.val;                                  // add to sum
            l1 = l1.next;                                   // and go to next node
        }
        if(l2 !== null) {                                   // if input linked list l2 is not at the tail
            sum += l2.val;                                  // add to sum
            l2 = l2.next;                                   // and go to next node
        }
        if(sum >= 10) {                                     // if sum is bigger than 10
            carry = 1;                                      // create carry
            sum -= 10;                                      // and leave last digit only
        }
        head.next = new ListNode(sum, null);                // create new node with last digit and connect to head
        head = head.next;                                   // to repeat this process, head should be head.next
                                                            // otherwise it will overwrite second node
        sum = carry;
        carry = 0;
    }
    return summedList.next;                                 // return next node of summedList because it starts with 0
};



///////////////////////////////////////////////////////////////////////////
///////////////////////// Test Input Linked-lists /////////////////////////
///////////////////////////////////////////////////////////////////////////
const linkedList1 = {
    val: 2,
    next: {
        val: 4,
        next: {
            val: 3,
            next: null
        }
    }
};
const linkedList2 = {
    val: 5,
    next: {
        val: 6,
        next: {
            val: 4,
            next: null
        }
    }
};
