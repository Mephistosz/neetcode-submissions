class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int cc = 0;

        for (int num : nums) {

            if (num == 1) {
                cc++;
            } else {
                c = Math.max(c, cc);
                cc = 0;
            }

        }

        return Math.max(c, cc);
    }
}