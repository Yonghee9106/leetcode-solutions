class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }

        int startIndex = 0;                                             // first index of substring
        int endIndex = 0;                                               // last index of substring
        int maxLength = 0;                                              // max length of substring

        Set<Character> substring = new HashSet<>();                     // HashSet can't contain duplicate values

        while(endIndex < s.length()) {                                  // while end index is less than the input s.length
            if(!substring.contains(s.charAt(endIndex))) {               // if substring doesn't contain duplicate value
                substring.add(s.charAt(endIndex));                      // add that character to substring
                endIndex++;
                maxLength = Math.max(maxLength, substring.size());      // find the max
            } else {                                                    // if substring contains duplicate value
                substring.remove(s.charAt(startIndex));                 // remove start index character
                startIndex++;                                           // so that we can search another substring
            }
        }
        return maxLength;
    }
}
