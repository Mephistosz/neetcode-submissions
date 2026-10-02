class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            int sCharPosition = sChar - 'a';
            int tCharPosition = tChar - 'a';

            alphabet[sCharPosition] = alphabet[sCharPosition] + 1;
            alphabet[tCharPosition] = alphabet[tCharPosition] - 1;
        }

        for (int num : alphabet) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
