class Solution {
    public int reverse(int x) {
        int reverse = 0;

        // for all digits in x, pop last digit(tail) and push it to the back of the reverse
        while (x != 0) {
            int tail = x % 10;                              // pop last digit
            int tempReverse = reverse * 10 + tail;          // push it to the back of the reverse
            if ((tempReverse - tail) / 10 != reverse) {     // check overflows
                return 0;
            }
            reverse = tempReverse;
            x = x / 10;                                     // remove last digit
        }
        return reverse;
    }
}
