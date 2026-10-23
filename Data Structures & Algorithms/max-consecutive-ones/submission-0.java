class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tmp = 0;

        for (int num : nums) {
            if (num == 1) {
                tmp++;
            } else {
                tmp = 0;
            }

            count = Math.max(count, tmp);
        }

        return count;
    }
}