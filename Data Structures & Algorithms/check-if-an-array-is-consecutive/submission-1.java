class Solution {
    public boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] - x != 1) {
                return false;
            }

            x = nums[i];
        }

        return true;
    }
}
