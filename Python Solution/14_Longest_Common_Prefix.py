##################
# First Solution #
##################

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not str:
            return ""

        shortest = min(strs, key=len)

        for index, char in enumerate(shortest):
            for others in strs:
                if others[index] != char:
                    return shortest[:index]
        return shortest



###################
# Second Solution #
###################





print(Solution().longestCommonPrefix(["flower", "flow", "flight"]))