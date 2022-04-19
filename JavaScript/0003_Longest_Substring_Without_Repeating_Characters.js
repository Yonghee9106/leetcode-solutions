/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    if(s.length == 0) {                                     // if size of input s is 0,
        return 0;                                           // return 0, no substring
    }

    const substring = new Map();                            // key: character, value: index
    let startIndex = 0;                                     // start index of substring
    let maxLen = 0;                                         // max length of substring
    
    for(let i=0; i<s.length; i++) {                         // for all input s characters
        // if there's duplicated character, move start index next to duplicated character index
        if(substring.has(s[i])) {                           // if current character is existing already in substring,
            startIndex = Math.max(substring.get(s[i])+1, startIndex);   // move start index forward, can't go backward
        }                                                   // substring.get(s[i]) == duplicated character index

        substring.set(s[i], i);                             // add current character and index to substring
        maxLen = Math.max(i-startIndex+1, maxLen);          // get max length of substring
    }                                                       // i-startIndex+1 == length of current substring

    return maxLen;
};
