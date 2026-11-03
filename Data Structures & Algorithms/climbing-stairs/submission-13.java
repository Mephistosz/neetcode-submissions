class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        
        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n <= 1) {
            map.put(n, 1);
            return map.get(n);
        }
        if (n == 2) {
            map.put(n, 2);
            return map.get(n);
        }

        map.put(n, climbStairs(n - 1) + climbStairs(n - 2));

        return map.get(n);
    }
}
