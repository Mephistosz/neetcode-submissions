class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] remaining = new int[2];

        for (int student : students) {
            remaining[student]++;
        }

        for (int sandwiche : sandwiches) {
            if (remaining[sandwiche] == 0) {
                break;
            }
            remaining[sandwiche]--;
        }

        return remaining[0] + remaining[1];
    }
}