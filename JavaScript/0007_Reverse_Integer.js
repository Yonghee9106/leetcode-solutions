/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    // x = -123
    // 1) get absolute value of x,  x = 123
    // 2) convert x to string,      x = '123'
    // 3) split x,                  x = [1,2,3]
    // 4) revese an array x,        x = [3,2,1]
    // 5) concatenate all elements, x = '321'
    const reversed = Math.abs(x).toString().split('').reverse().join('');

    // check overflows
    if (reversed > 2**31) {
        return 0;
    }

    // return with sign
    return reversed * Math.sign(x);
};
