class Solution {
    public String longestPalindrome(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int len = s.length();

        if(len < 2) {
            return s;
        }

        for(int i=0; i<len; i++) {
            int len1 = expandCenter(s, i, i);
            int len2 = expandCenter(s, i, i+1);

            if(endIndex < Math.max(len1, len2)) {
                startIndex = (len1>len2) ? (i-len1/2) : (i-len2/2+1);
                endIndex = Math.max(len1, len2);
            }
        }
        return s.substring(startIndex, endIndex+startIndex);
    }

    private int expandCenter(String s, int start, int end) {
        while(start >= 0 && end < s.length()) {
            if(s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            else {
                break;
            }
        }
        return end - start - 2 + 1;
    }
}
