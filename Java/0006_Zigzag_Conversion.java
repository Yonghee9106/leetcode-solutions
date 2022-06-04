class Solution {
    public String convert(String s, int numRows) {
        // if the numRows is 1, no zigzag pattern
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder zigzag = new StringBuilder();
        int len = s.length();
        int cycle = 2 * numRows - 2;
    }
}
