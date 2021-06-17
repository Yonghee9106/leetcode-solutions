class Solution:
    def isValid(self, s: str) -> bool:                          # type s: str, return type: bool
        stack = []
        dic = {')': '(', '}': '{', ']': '['}                    # key: closed bracket, value: open bracket
        dic_open = dic.values()                                 # dic_open: open bracket

        for ch in s:                                            # for all characters in s
            if ch in dic_open:                                  # if ch is open bracket
                stack.append(ch)                                # add it in the stack list
            else:                                               # if ch is closed bracket
                if len(stack) > 0 and stack[-1] == dic[ch]:     # and if the closed bracket is paired with last bracket of the stack
                    stack.pop()                                 # pop it
                else:                                           # if not paired,
                    return False                                # it is not valid parentheses
        return len(stack) == 0                                  # if all open brackets in stack list is paired, it is valid parentheses


print(Solution().isValid("()[]{}"))
