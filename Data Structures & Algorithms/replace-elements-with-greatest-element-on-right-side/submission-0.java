class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValueToRight = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxValueToRight;

            if (temp > maxValueToRight) {
                maxValueToRight = temp;
            }
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}