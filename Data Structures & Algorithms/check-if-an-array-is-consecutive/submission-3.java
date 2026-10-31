class Solution {
    public boolean isConsecutive(int[] nums) {
        int min = nums[0];
        int max = min;

        for (int i = 1; i < nums.length; i++) {
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;
        }

        return max - min == nums.length - 1;
    }

}