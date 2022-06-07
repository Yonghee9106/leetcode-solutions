class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows < 2 or numRows >= len(s):
            return s

        rows = [''] * numRows
        rowNum, direction = 0, 1

        for char in s:
            rows[rowNum] += char
            if rowNum == 0:
                direction = 1
            elif rowNum == numRows -1:
                direction = -1
            rowNum += direction

        return ''.join(rows)
