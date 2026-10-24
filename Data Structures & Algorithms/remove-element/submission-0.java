class Solution {
    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        Integer positionToWrite = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[positionToWrite] = nums[i];
                positionToWrite += 1;
                count++;
            }
        }
        return count;
    }
}