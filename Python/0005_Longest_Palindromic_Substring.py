class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        # if length of s is less than 0, there is no palindrome
        if len(s) < 1:
            return ""
        # if length of s is 1, s is palindrome itself
        if len(s) == 1:
            return s
        
        maxLen = 1
        start = 0

        # from all elements in s, find the longest palindrome
        for end in range(len(s)):
            # if s[end-maxLen-1:end+1] is palindrome, it means length of palindrome is increased by 2
            if end-maxLen >=1 and s[end-maxLen-1:end+1]==s[end-maxLen-1:end+1][::-1]:
                start = end-maxLen-1
                maxLen+=2
                continue
            # if s[end-maxLen:end+1] is palindrome, it means length of palindrome is increased by 1
            if end-maxLen >= 0 and s[end-maxLen:end+1]==s[end-maxLen:end+1][::-1]:
                start=end-maxLen
                maxLen+=1

        return s[start:start+maxLen]
