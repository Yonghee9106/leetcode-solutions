class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        startIndex = 0
        maxLength = 0
        substring = {}
        
        for i in range(len(s)):
            if s[i] in substring and startIndex <= substring[s[i]]:
                startIndex = substring[s[i]] + 1
            else:
                maxLength = max(maxLength, i - startIndex + 1)

            substring[s[i]] = i

        return maxLength

print(Solution().lengthOfLongestSubstring("abcabcbb"))
