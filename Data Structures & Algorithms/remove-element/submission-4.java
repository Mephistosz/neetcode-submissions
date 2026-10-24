class Solution {
    public int removeElement(int[] nums, int val) {
        int writePosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val && i != writePosition) {
                nums[writePosition] = nums[i];
                
            }

            if (nums[i] != val) {
                writePosition++;
            }
        }

        return writePosition++;
    }
}