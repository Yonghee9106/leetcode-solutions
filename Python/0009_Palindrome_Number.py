##################
# First Solution #
##################

# class Solution:
#     def isPalindrome(self, x):
#         for_num = x
#         rev_num = 0
#
#         while x > 0:                                # if x is negative number, it's not palindrome
#             rev_num = (rev_num * 10) + (x % 10)     # make reverse number
#             x = x // 10
#
#         return for_num == rev_num



###################
# Second Solution #
###################

class Solution:
    def isPalindrome(self, x):                      # [start:stop:step], -1 step means reverse step
        return str(x)[::-1] == str(x)               # only sequence data types can be sliced in this way


print(Solution().isPalindrome(-121))
