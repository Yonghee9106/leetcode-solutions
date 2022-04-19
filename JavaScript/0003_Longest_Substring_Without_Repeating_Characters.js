/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const seen = new Map();

    var start = 0;
    var max = 0;
    
    for(let i=0; i<s.length; i++) {
        if(seen.has(s[i])) {
            start = Math.max(seen.get(s[i])+1, start);
        }

        seen.set(s[i], i);
        max = Math.max(i-start+1, max);
    }
    return max;
};
