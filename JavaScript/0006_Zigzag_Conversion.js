/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    const len = s.length;

    if (numRows < 2 || len < numRows) {
        return s;
    }

    const rows = new Array(numRows).fill('');
    let reverse = false;
    let count = 0;

    for (let i = 0; i < len; i++) {
        rows[count] += s[i];
        reverse? count--: count++;
        if (count === numRows - 1 || count === 0) {
            reverse = !reverse;
        }
    }
    
    return rows.join('');
};
