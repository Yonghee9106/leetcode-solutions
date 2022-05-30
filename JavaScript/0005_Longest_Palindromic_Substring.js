/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let startIndex = 0;             // start index of palindrome
    let endIndex = 0;               // end index of palindrome

    if(s.length < 2) {
        return s;
    }
    
    // from all elements in s, expand mirrored area to find the longest palindrome
    for (let center1 = 0; center1 < s.length; center1++) {
        // consider both odd and even palindromes
        for (let center2 of [center1, center1+1]) {
            // center1 == center2 for odd palindrome, center1+1 == center2 for even palindrome
            let startTemp = center1;
            let endTemp = center2;
            // start index >= 0 && end index <= length of s && start and end elements are identical
            while(startTemp >= 0 && endTemp <= s.length && s[startTemp] === s[endTemp]) {
                // find the longest palindrome index
                [startIndex, endIndex] = (endTemp-startTemp+1) > (endIndex-startIndex+1) ? [startTemp, endTemp] : [startIndex, endIndex];
                // expand mirrored area
                startTemp--, endTemp++;
            }
        }
    }

    return s.substring(startIndex, endIndex+1);
};
