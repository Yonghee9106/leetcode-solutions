# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        summedList = ListNode(0, None)              # create new linked list for return
        head = summedList                           # copy linked list but same reference
        sum = 0
        carry = 0

        while (l1 or l2 or sum>0):                  # while input linked-lists are not none or sum is bigger than 0
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

    # linked list print method
    def printList(self, list):
        print('[', end="")
        while(list.next != None):
            print('%d,' % list.val, end="")
            list = list.next
        print('%d]' % list.val)



# Example 1, output: [7,0,8]
list1 = ListNode(2)
head1 = list1
head1.next = ListNode(4)
head1 = head1.next
head1.next = ListNode(3, None)

list2 = ListNode(5)
head2 = list2
head2.next = ListNode(6)
head2 = head2.next
head2.next = ListNode(4, None)

example1 = Solution().addTwoNumbers(list1, list2)
Solution().printList(example1)                          # [7,0,8]


# Example 2, output: [0]
list3 = ListNode(0, None)
list4 = ListNode(0, None)

example2 = Solution().addTwoNumbers(list3, list4)
Solution().printList(example2)                          # [0]


# Example 3, output: [8,9,9,9,0,0,0,1]
list5 = ListNode(9)
head5 = list5
head5.next = ListNode(9)
head5 = head5.next
head5.next = ListNode(9)
head5 = head5.next
head5.next = ListNode(9)
head5 = head5.next
head5.next = ListNode(9)
head5 = head5.next
head5.next = ListNode(9)
head5 = head5.next
head5.next = ListNode(9, None)

list6 = ListNode(9)
head6 = list6
head6.next = ListNode(9)
head6 = head6.next
head6.next = ListNode(9)
head6 = head6.next
head6.next = ListNode(9, None)

example3 = Solution().addTwoNumbers(list5, list6)
Solution().printList(example3)                          # [8,9,9,9,0,0,0,1]
