class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;

        int start = 0;
        int end = s.length() - 1;

        Set<Character> set = new HashSet<>();
        set.clear();

        int i = 0;

        while (start <= end) {
            var startChar = s.charAt(start);

            if (!set.contains(startChar)) {
                set.add(startChar);
                count = Math.max(count, set.size());
            } else {
                while (set.contains(startChar)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(startChar);
            }

            start++;
        }

        return count;
    }
}
