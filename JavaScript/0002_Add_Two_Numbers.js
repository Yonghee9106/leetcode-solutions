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
    let summedList = new ListNode(0, null);
    let head = summedList;
    let sum = 0;
    let carry = 0;

    while(l1 !== null || l2 !== null || sum > 0) {
        if(l1 !== null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if(l2 !== null) {
            sum += l2.val;
            l2 = l2.next;
        }
        if(sum >= 10) {
            carry = 1;
            sum -= 10;
        }
        head.next = new ListNode(sum, null);
        head = head.next;

        sum = carry;
        carry = 0;
    }
    return summedList.next;
};



///////////////////////////////////////////////////////////////////////////
///////////////////////// Test Input linked-lists /////////////////////////
///////////////////////////////////////////////////////////////////////////
const list1 = {
    val: 2,
    next: {
        val: 4,
        next: {
            val: 3,
            next: null
        }
    }
};
const list2 = {
    val: 5,
    next: {
        val: 6,
        next: {
            val: 4,
            next: null
        }
    }
};
