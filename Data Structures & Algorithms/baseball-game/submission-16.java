class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque<>();
        int sum = 0;

        for (String operation : operations) {

            if (operation.equals("+")) {
                var t = deque.pollLast();
                var t2 = deque.peekLast() + t;
                deque.addLast(t);
                deque.addLast(t2);
                sum += deque.peekLast();
            } else if (operation.equals("C")) {
                sum -= deque.pollLast();
            } else if (operation.equals("D")) {
                deque.addLast(deque.peekLast() * 2);
                sum += deque.peekLast();
            } else {
                deque.addLast(Integer.parseInt(operation));
                sum += deque.peekLast();
            }
            
        }

        return sum;
    }
}