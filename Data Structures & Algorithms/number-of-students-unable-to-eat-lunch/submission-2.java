class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsZero = 0;
        int studentsOne = 0;

        for (int student : students) {
            if (student == 0) {
                studentsZero++;
            } else {
                studentsOne++;
            }
        }

        int i = 0;

        while (i < sandwiches.length) {
            if (sandwiches[i] == 0 && studentsZero > 0) {
                studentsZero--;
            i++;

            } else if (sandwiches[i] == 1 && studentsOne > 0) {
                studentsOne--;
            i++;

            } else {
                return studentsZero + studentsOne;
            }
        }

        return studentsZero + studentsOne;
    }
}