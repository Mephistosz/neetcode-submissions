class Solution {
    public boolean isConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int min = nums[0];
        int max = min;

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (!seen.add(x)) {
                return false;
            }
            max = x > max ? x : max;
            min = x < min ? x : min;
        }

        return max - min == nums.length - 1;
    }
}