class Solution {
    public int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int tail = x % 10;
            int tempReverse = reverse * 10 + tail;
            if ((tempReverse - tail) / 10 != reverse) {
                return 0;
            }
            reverse = tempReverse;
            x = x / 10;
        }
        return reverse;
    }
}
