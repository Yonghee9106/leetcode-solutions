# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        summedList = ListNode(0, None)              # create new linked list for return
        head = summedList                           # copy linked list but same reference
        sum = 0
        carry = 0

        while (l1 or l2 or sum>0):                  # if input linked-lists are not none or sum is bigger than 0
            if l1:                                  # if input linked list l1 is not at the tail
                sum += l1.val                       # add to sum
                l1 = l1.next                        # and go to next node
            if l2:                                  # if input linked list l2 is not at the tail
                sum += l2.val                       # add to sum
                l2 = l2.next                        # and go to next node
            if(sum >= 10):                          # if sum is greater than or equal to 10
                carry = 1                           # create carry
                sum = sum % 10                      # and leave last digit only
            head.next = ListNode(sum, None)         # create new node with last digit and connect to head
            head = head.next                        # to repeat this process, head should be head.next
                                                    # otherwise it will overwrite second node
            sum = carry
            carry = 0
        return summedList.next                      # return next node of summedList because it starts with 0
