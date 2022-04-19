/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const substring = new Map();

    var startIndex = 0;
    var maxLen = 0;
    
    for(let i=0; i<s.length; i++) {
        if(substring.has(s[i])) {
            startIndex = Math.max(substring.get(s[i])+1, startIndex);
        }

        substring.set(s[i], i);
        maxLen = Math.max(i-startIndex+1, maxLen);
    }
    return maxLen;
};
