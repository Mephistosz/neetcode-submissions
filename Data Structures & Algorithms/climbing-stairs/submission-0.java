class Solution {
    public int climbStairs(int n) {
        int step1 = 0;
        int step2 = 1;

        for (int i = 0; i < n; i++) {
            var next = step1 + step2;
            step1 = step2;
            step2 = next;
        }

        return step2;
    }
}
