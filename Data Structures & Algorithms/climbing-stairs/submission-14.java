class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result;

        if (n <= 1) {
            result = 1;
        } else if (n == 2) {
            result = 2;
        } else {
            result = climbStairs(n - 1) + climbStairs(n - 2);
        }

        memo.put(n, result);

        return result;
    }
}
