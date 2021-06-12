class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        dic = {')': '(', '}': '{', ']': '['}                    # key: closed bracket, value: open bracket
        dic_open = dic.values()

        for ch in s:
            if ch in dic_open:
                stack.append(ch)
            else:
                if len(stack) > 0 and stack[-1] == dic[ch]:
                    stack.pop()
                else:
                    return False
        return len(stack) == 0


print(Solution().isValid("()[]{}"))
