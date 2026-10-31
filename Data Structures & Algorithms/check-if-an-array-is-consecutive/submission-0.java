class Solution {
    public boolean isConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int x = nums[0];


        for (int i = 1; i < nums.length; i++) {

            if (!set.add(nums[i])) {
                return false;
            }

            if ((x + 1) != nums[i] && x - 1 != nums[i]) {
                return false;
            };

            x=nums[i];
        }

        return true;
    }
}
