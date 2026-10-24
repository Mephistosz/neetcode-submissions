class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            
            if (nums[i] == val) {
                nums[i] = nums[--n];
            }
            if (nums[i] != val) {
                i++;
            }
        }

        return n;
    }
}