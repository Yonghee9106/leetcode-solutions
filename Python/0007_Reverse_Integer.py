##################
# First Solution #
##################

# class Solution:
#     def reverse(self, x):                               # type x: int
#         sign = [1, -1][x < 0]                           # sign = -1 if x < 0 else 1
#         rev_num = sign * int(str(abs(x))[::-1])         # [start:stop:step], -1 step means reverse step
#                                                         # only sequence data types can be sliced in this way
#         if -pow(2, 31) <= rev_num <= pow(2, 31) - 1:    # set the range
#             return rev_num
#         else:
#             return 0



###################
# Second Solution #
###################

class Solution:
    def reverse(self, x):                                   # type x: int
        sign = [1, -1][x < 0]                               # sign = -1 if x < 0 else 1
        rev_num = 0
        num = abs(x)                                        # abs() function returns the absolute value of a number

        while num:
            num, mod = divmod(num, 10)                      # num is quotient, mod is remainder
            rev_num = (rev_num * 10) + mod                  # creating reverse num

        if -pow(2, 31) <= rev_num <= pow(2, 31) - 1:        # if -(2**31) <= rev_num <= (2**31) - 1
            return sign * rev_num                           # if in the range, return with a sign
        else:
            return 0


print(Solution().reverse(123))                              # 321
print(Solution().reverse(-123))                             # -321
print(Solution().reverse(120))                              # 21
