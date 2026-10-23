class Solution {
    public boolean isValid(String s) {
        
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] symbols = s.toCharArray();
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> stack = new ArrayDeque<>();

        for (Character character : symbols) {
            if (isOpeningSymbol(character)) {
                stack.push(character);
            } else if (!popAndCheckClosingSymbol(character, stack, map)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    static boolean popAndCheckClosingSymbol(
        Character character, Deque<Character> stack, Map<Character, Character> map) {
        if (stack.isEmpty()) {
            return false;
        }

        return map.get(character).equals(stack.poll());
    }

    static boolean isOpeningSymbol(Character character) {
        return character == '(' || character == '[' || character == '{';
    }

}
