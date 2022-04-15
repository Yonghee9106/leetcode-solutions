class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;                                             // first index of substring
        int endIndex = 0;                                               // last index of substring
        int maxLength = 0;                                              // max length of substring

        Set<Character> substring = new HashSet<>();                     // hashset can't contain duplicate values

        while(endIndex < s.length()) {                                  // while end index is less than input string s
            if(!substring.contains(s.charAt(endIndex))) {               // if substring doesn't contains duplicate value
                substring.add(s.charAt(endIndex));                      // add that character to substring
                endIndex++;
                maxLength = Math.max(maxLength, substring.size());      // find max
            } else {                                                    // if substring contains duplicate value
                substring.remove(s.charAt(startIndex));                 // remove first start index character
                startIndex++;                                           // so that we can search other substrings
            }
        }
        return maxLength;
    }
}
