/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    const len = s.length;

    // no zigzag pattern for these cases
    if (numRows < 2 || len < numRows) {
        return s;
    }

    // create Array object of length numRows and fill with ''
    // rows[0]: first row characters, rows[1]: second row characters...
    const rows = new Array(numRows).fill('');
    let reverse = false;
    let count = 0;

    // save characters in the correct rows, find the correct rows by count
    // if reach the end or start of the rows, change reverse value
    // rows[0] = A       E
    // rows[1] =   B   D   F
    // rows[2] =     C
    for (let i = 0; i < len; i++) {
        rows[count] += s[i];                            // save characters in the correct rows
        reverse? count-- : count++;                     // go down or up to the next rows
        if (count === numRows - 1 || count === 0) {     // if reach the end or start of the rows,
            reverse = !reverse;                         // change reverse value
        }
    }
    
    // rows.join('') = AEBDFC
    return rows.join('');
};
