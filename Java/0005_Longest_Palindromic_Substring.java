class Solution {
    public String longestPalindrome(String s) {
        int startIndex = 0;
        int lenOfPalindrome = 0;
        int len = s.length();

        if(len < 2) {
            return s;
        }

        // from all elements in s, expand mirrored area to find the longest palindrome
        for(int i=0; i<len; i++) {
            // get length of palindrome
            int len1 = expandCenter(s, i, i);       // for odd palindrome
            int len2 = expandCenter(s, i, i+1);     // for even palindrome

            // if current palindrome is bigger than previous one
            if(lenOfPalindrome < Math.max(len1, len2)) {
                // i is the middle index of palindrome, find start index and total length of palindrome
                startIndex = (len1>len2) ? (i-len1/2) : (i-len2/2+1);
                lenOfPalindrome = Math.max(len1, len2);
            }
        }
        return s.substring(startIndex, startIndex + lenOfPalindrome);
    }

    // from start and end elements, expand mirrored area
    private int expandCenter(String s, int start, int end) {
        while(start >= 0 && end < s.length()) {
            // if it is mirrored, the start goes to left and, the end goes to right side of string
            if(s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            else {
                break;
            }
        }
        // return the length of palindrome
        // end - start + 1 = total length, - 2 means current expanded elements are not mirrored
        return end - start + 1 - 2;
    }
}
