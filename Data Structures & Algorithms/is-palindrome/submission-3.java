class Solution {
    public boolean isPalindrome(String s) {
        String b = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String c = new StringBuilder(b).reverse().toString();

        return b.equals(c);
    }
}
