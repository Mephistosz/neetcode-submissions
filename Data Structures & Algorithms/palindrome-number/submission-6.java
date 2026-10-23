class Solution {
    public boolean isPalindrome(int x) {
        int tmp = x;
        int y = 0;

            while (tmp > 0) {
            var tmp2 = tmp % 10;
            tmp /= 10;
            y = y * 10 + tmp2;
        }

        return x == y;
    }
}