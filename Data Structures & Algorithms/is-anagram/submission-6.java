class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            sMap.merge(sChar, 1, Integer::sum);
            tMap.merge(tChar, 1, Integer::sum);
        }

        return sMap.equals(tMap);
    }
}
