class Solution:
    def isValid(self, s: str) -> bool:                          # type s: str, return type: bool
        stack = []                                              # stack list where we will store open brackets
        brkt = {')': '(', '}': '{', ']': '['}                   # key: closed brackets, value: open brackets
        brkt_open = brkt.values()                               # brkt_open: open brackets

        for ch in s:                                            # for all characters in input s
            if ch in brkt_open:                                 # if ch is open bracket
                stack.append(ch)                                # append ch on the stack list
            else:                                               # if ch is closed bracket
                if len(stack) > 0 and stack[-1] == brkt[ch]:    # and if the closed bracket is paired with last bracket on the stack
                    stack.pop()                                 # pop it
                else:                                           # if not paired,
                    return False                                # it is not valid parentheses
        return len(stack) == 0                                  # if all open brackets on the stack are paired, it is valid parentheses


print(Solution().isValid("()[]{}"))
