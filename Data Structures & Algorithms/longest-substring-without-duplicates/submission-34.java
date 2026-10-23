class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int start = 0;
        int count = 0;
        int left = 0;

        while (start < s.length()) {
            var startChar = s.charAt(start);

            while (set.contains(startChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(startChar);
            count = Math.max(count, set.size());
            start++;
        }

        return count;
    }
}
