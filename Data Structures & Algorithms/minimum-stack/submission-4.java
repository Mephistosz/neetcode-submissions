class MinStack {
    List<Integer[]> list;
    Integer min;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        if (list.isEmpty()) {
            min = val;
        } else {
            min = Math.min(val, getMin());
        }

        list.addLast(new Integer[] {val, min});
    }

    public void pop() {
        list.removeLast();
    }

    public int top() {
        return list.getLast()[0];
    }

    public int getMin() {
        return list.getLast()[1];
    }
}