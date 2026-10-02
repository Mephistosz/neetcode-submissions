class Solution {
    public boolean isPalindrome(String s) {
        String b = s.toLowerCase();
        b = b.replaceAll("[^a-zA-Z0-9]", "");
        String c = new StringBuilder(b).reverse().toString();

        if (b.equals(c)) {
            return true;
        };

        return false;
    }
}
