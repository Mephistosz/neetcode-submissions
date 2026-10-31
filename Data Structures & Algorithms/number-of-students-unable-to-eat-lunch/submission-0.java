class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> studentsQueue = new ArrayDeque<>();
        ArrayDeque<Integer> sandwichesQueue = new ArrayDeque<>();

        for (int i = 0; i < students.length; i++) {
            studentsQueue.addLast(students[i]);
            sandwichesQueue.addLast(sandwiches[i]);
        }

        int count = 0;

        while (!sandwichesQueue.isEmpty()) {
            var firstStudent = studentsQueue.pollFirst();

            if (firstStudent == sandwichesQueue.getFirst()) {
                sandwichesQueue.pollFirst();
                count = 0;
            } else {
                studentsQueue.addLast(firstStudent);
                count++;
            }

            if (count == studentsQueue.size()) {
                return studentsQueue.size();
            }
        }

        return 0;
    }
}