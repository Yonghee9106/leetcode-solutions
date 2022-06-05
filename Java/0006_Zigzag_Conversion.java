class Solution {
    public String convert(String s, int numRows) {
        // if the numRows is 1, no zigzag pattern
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder zigzag = new StringBuilder();
        int len = s.length();
        // zigzag cycle formula
        // after this cycle, same pattern comes again
        int cycle = 2 * numRows - 2;

        // from row 0, visit all rows and append characters
        for (int row = 0; row < numRows; row++) {
            // cycleIdx is a cycle index (e.g 1st cycle, 2nd cycle...)
            for (int cycleIdx = 0; cycleIdx + row < len; cycleIdx += cycle) {
                zigzag.append(s.charAt(cycleIdx + row));
                // except the first and last rows, each row has one another character between cycle 
                if (row != 0 && row != numRows - 1 && cycleIdx + cycle - row < len) {
                    zigzag.append(s.charAt(cycleIdx + cycle - row));
                }
            }
        }
        
        return zigzag.toString();
    }
}
