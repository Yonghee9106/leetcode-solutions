class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;                                             // first index of substring
        int endIndex = 0;                                               // last index of substring
        int maxLength = 0;

        Set<Character> substring = new HashSet<>();

        while(endIndex < s.length()) {
            if(!substring.contains(s.charAt(endIndex))) {
                substring.add(s.charAt(endIndex));
                endIndex++;
                maxLength = Math.max(maxLength, substring.size());
            } else {
                substring.remove(s.charAt(startIndex));
                startIndex++;
            }
        }
        return maxLength;
    }
}
