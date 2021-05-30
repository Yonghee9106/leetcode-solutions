##################
# First Solution #
##################

# class Solution(object):
#     def longestCommonPrefix(self, strs):
#         """
#         :type strs: List[str]
#         :rtype: str
#         """
#         if not strs:                                # if strs list is empty,
#             return ""
# 
#         shortest = min(strs, key=len)               # assign the shortest word in strs list by length
# 
#         for index, char in enumerate(shortest):
#             for others in strs:                     # compare shortest and other words in strs list
#                 if others[index] != char:           # if any character from left is different,
#                     return shortest[:index]         # return up to that index
#         return shortest                             # if there is no difference between the shortest and other words in strs, return shortest



###################
# Second Solution #
###################

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:                                # if strs list is empty,
            return ""

        min_str = min(strs)                         # returns min based on alphabetical order
        max_str = max(strs)                         # returns max based on alphabetical order

        for index, char in enumerate(min_str):
            if char != max_str[index]:              # only compare min and max words
                return min_str[:index]              # because they're the words that make the most difference
        return min_str                              # if there is no difference between min and max, return min


print(Solution().longestCommonPrefix(["flower", "flow", "flight"]))
