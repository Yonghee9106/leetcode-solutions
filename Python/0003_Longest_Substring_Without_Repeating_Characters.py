class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        startIndex = 0                                                  # start index of substring
        maxLength = 0                                                   # max length of substring
        substring = {}                                                  # dictionary {key: character, value: index}

        if len(s) == 0:                                                 # if size of input s is 0,
            return 0                                                    # return 0, no substring
        
        for i in range(len(s)):                                         # for all input s characters
            # if there's duplicated character, move start index next to duplicated character's index
            if s[i] in substring and startIndex <= substring[s[i]]:     # if current character is existing in substring, and current index is bigger than startIndex
                startIndex = substring[s[i]] + 1                        # move startIndex forward, can't go backward, substring[s[i]] == duplicated character's index
            else:
                maxLength = max(maxLength, i - startIndex + 1)          # get max length of substring, i-startIndex+1 == length of current substring

            substring[s[i]] = i                                         # add current character and index to substring

        return maxLength

print(Solution().lengthOfLongestSubstring("abcabcbb"))                  # 3
print(Solution().lengthOfLongestSubstring("bbbbb"))                     # 1
print(Solution().lengthOfLongestSubstring("pwwkew"))                    # 3
