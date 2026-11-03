class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int current = 2;

        for (int i = 1; i < n; i++) {
            var next = prev + current;
            prev = current;
            current = next;
        }

        return prev;
    }
}
