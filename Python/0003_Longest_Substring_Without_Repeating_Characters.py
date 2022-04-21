class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        startIndex = 0                                                  # start index of substring
        maxLength = 0                                                   # max length of substring
        substring = {}

        if len(s) == 0:                                                 # if size of input s is 0,
            return 0                                                    # return 0, no substring
        
        for i in range(len(s)):
            if s[i] in substring and startIndex <= substring[s[i]]:
                startIndex = substring[s[i]] + 1
            else:
                maxLength = max(maxLength, i - startIndex + 1)

            substring[s[i]] = i

        return maxLength

print(Solution().lengthOfLongestSubstring("abcabcbb"))
