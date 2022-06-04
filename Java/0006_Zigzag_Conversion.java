class Solution {
    public String convert(String s, int numRows) {
        // if the numRows is 1, no zigzag pattern
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder zigzag = new StringBuilder();
        int len = s.length();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int i = 0; i + row < len; i += cycle) {
                zigzag.append(s.charAt(i + row));
                if (row != 0 && row != numRows - 1 && i + cycle - row < len) {
                    zigzag.append(s.charAt(i + cycle - row));
                }
            }
        }
        
        return zigzag.toString();
    }
}
