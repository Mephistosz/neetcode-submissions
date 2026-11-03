class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {

        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n == 1) {
            map.put(n, 1);
            return 1;
        } else if (n == 2) {
            map.put(n, 2);
            return 2;
        }

        var x = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, x);

        return x;
    }
}
