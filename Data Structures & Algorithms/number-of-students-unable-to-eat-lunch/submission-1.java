class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> studentsQueue = new ArrayDeque<>();

        for (int i = 0; i < students.length; i++) {
            studentsQueue.addLast(students[i]);
        }

        int count = 0;
        int top = 0;

        while (!studentsQueue.isEmpty()) {
            var firstStudent = studentsQueue.pollFirst();

            if (firstStudent.equals(sandwiches[top])) {
                top++;
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