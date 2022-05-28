class Solution {
    public String longestPalindrome(String s) {
        int startIndex;
        int endIndex;
        int len = s.length();

        if(len < 2) {
            return s;
        }

        for(int i=0; i<len; i++) {
            expandCenter(s, i, i);
            expandCenter(s, i, i+1);
        }
    }

    private int expandCenter(String s, int start, int end) {
        
    }
}
