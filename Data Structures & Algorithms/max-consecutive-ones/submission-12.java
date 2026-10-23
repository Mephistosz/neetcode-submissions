class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int currentCount = 0;

        for (int num : nums) {

            if (num == 1) {
                currentCount++;
            } else {
                count = Math.max(count, currentCount);
                currentCount = 0;
            }

        }

        return Math.max(count, currentCount);
    }
}