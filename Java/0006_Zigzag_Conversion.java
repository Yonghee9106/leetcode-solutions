class Solution {
    public String convert(String s, int numRows) {
        // if the numRows is 1, no zigzag pattern
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder zigzag = new StringBuilder();
        int len = s.length();
        int cycle = 2 * numRows - 2;                // zigzag cycle formula

        // from row 0, visit all rows and append characters
        for (int row = 0; row < numRows; row++) {
            // i is a cycle index (e.g 1st cycle, 2nd cycle...)
            for (int cycleIdx = 0; cycleIdx + row < len; cycleIdx += cycle) {
                zigzag.append(s.charAt(cycleIdx + row));
                if (row != 0 && row != numRows - 1 && cycleIdx + cycle - row < len) {
                    zigzag.append(s.charAt(cycleIdx + cycle - row));
                }
            }
        }
        
        return zigzag.toString();
    }
}
