/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let startIndex = 0;
    let endIndex = 0;

    for (let center1 = 0; center1 < s.length; center1++) {

      for (let center2 of [center1, center1+1]) {

        let l = center1;
        let r = center2;
        while(s[l] && s[l] === s[r]) {
            [startIndex, endIndex] = (r-l+1) > (endIndex-startIndex+1) ? [l, r] : [startIndex, endIndex];
            l--, r++;
        }

      }

    }

    return s.substring(startIndex, endIndex+1);
};
