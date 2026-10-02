class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);

            var a = sChar - 'a';

            alphabet[a] = alphabet[a] + 1;
        }

        for (int i = 0; i < s.length(); i++) {
            char tChar = t.charAt(i);

            var b = tChar - 'a';

            alphabet[b] = alphabet[b] - 1;
        }

        for(int alphabetLetters: alphabet){
            if(alphabetLetters != 0){
                return false;
            }
        }

        return true;
    }
}
