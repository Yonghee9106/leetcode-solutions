class Solution:
    def convert(self, s: str, numRows: int) -> str:

        # no zigzag pattern for these cases
        if numRows < 2 or numRows >= len(s):
            return s

        rows = [''] * numRows           # create an array of length numRows and fill with ''
        currRow, direction = 0, 1

        # save characters in the correct rows, find the correct rows by currRow
        # if reach the end or start of the rows, change direction value
        # rows[0] = A       E
        # rows[1] =   B   D   F
        # rows[2] =     C
        for char in s:                      # for all characters in input s
            rows[currRow] += char           # add character to current Row
            if currRow == 0:                # if not reached the end of rows,
                direction = 1               # keep going down
            elif currRow == numRows -1:     # if reached the end of rows,
                direction = -1              # change direction, and go up
            currRow += direction            # positive direction = go down, negative direction = go up

        # ''.join(rows) = AEBDFC
        return ''.join(rows)

print(Solution().convert("PAYPALISHIRING", 3))              # Example 1
print(Solution().convert("PAYPALISHIRING", 4))              # Example 2
print(Solution().convert("A", 1))                           # Example 3