class Solution:
    def convert(self, s: str, numRows: int) -> str:

        # no zigzag pattern for these cases
        if numRows < 2 or numRows >= len(s):
            return s

        rows = [''] * numRows           # create an array of length numRows and fill with ''
        currRow, direction = 0, 1

        for char in s:
            rows[currRow] += char
            if currRow == 0:
                direction = 1
            elif currRow == numRows -1:
                direction = -1
            currRow += direction

        return ''.join(rows)

print(Solution().convert("PAYPALISHIRING", 3))              # Example 1
print(Solution().convert("PAYPALISHIRING", 4))              # Example 2
print(Solution().convert("A", 1))                           # Example 3
