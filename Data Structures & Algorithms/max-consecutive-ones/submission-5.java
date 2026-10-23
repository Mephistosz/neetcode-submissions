class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            currentCount = (num == 1) ? currentCount + 1 : 0;
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}