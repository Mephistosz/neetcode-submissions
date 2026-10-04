class Solution {
    public boolean isPalindrome(String s) {
        int[] alphabet = new int[26];
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if (!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }

            start++;
            end--;
            
            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }
            
        }

        return true;
    }
}
