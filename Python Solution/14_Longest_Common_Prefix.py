##################
# First Solution #
##################

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:                                # if strs list is empty,
            return ""

        shortest = min(strs, key=len)               # assign shortest word in strs by length

        for index, char in enumerate(shortest):
            for others in strs:
                if others[index] != char:           # if any character from left is different,
                    return shortest[:index]         # return before that index
        return shortest



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

        min_str = min(strs)
        max_str = max(strs)

        for index, char in enumerate(min_str):
            if char != max_str[index]:
                return min_str[:index]
        return min_str


print(Solution().longestCommonPrefix(["flower", "flow", "flight"]))
