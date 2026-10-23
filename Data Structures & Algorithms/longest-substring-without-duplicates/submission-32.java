class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;

        int start = 0;

        Set<Character> set = new HashSet<>();

        int i = 0;

        while (start <= s.length() - 1) {
            var startChar = s.charAt(start);

            while (set.contains(startChar)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(startChar);
            count = Math.max(count, set.size());

            start++;
        }

        return count;
    }
}
