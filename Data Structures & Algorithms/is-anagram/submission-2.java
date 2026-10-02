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

            sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            Integer a = sMap.get(sChar);
            Integer b = tMap.get(sChar);
            
            if (!a.equals(b)) {
                return false;
            }
        }

        return true;
    }
}
