class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementIndex = map.get(complement);
            if (complementIndex != null) {
                int[] indexes = {complementIndex, i};
                return indexes;
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
