/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    if(s.length == 0) {                                     // if size of input is 0,
        return 0;                                           // return 0, no substring
    }

    const substring = new Map();                            // key: character, value: index

    var startIndex = 0;
    var maxLen = 0;
    
    for(let i=0; i<s.length; i++) {                         // for all input s characters
        if(substring.has(s[i])) {                           // if current character is existing already,
            startIndex = Math.max(substring.get(s[i])+1, startIndex);   // move start index forward, can't go backward
        }

        substring.set(s[i], i);                             // add current character and index
        maxLen = Math.max(i-startIndex+1, maxLen);          // get max length of substring
    }
    return maxLen;
};
