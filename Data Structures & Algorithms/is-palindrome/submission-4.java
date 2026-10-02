class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char a = Character.toLowerCase(s.charAt(start));
            char b = Character.toLowerCase(s.charAt(end));

            if (!Character.isLetterOrDigit(a)) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(b)) {
                end--;
                continue;
            }

            if (a != b) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
