class ListNode {
    Integer val;
    ListNode prev;
    ListNode next;

    public ListNode(Integer val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

}

class MyStack {
    ListNode head;
    ListNode tail;

    public MyStack() {
        this.head = new ListNode(0, null, null);
        this.tail = head;
    }

    public void push(int x) {
        var node = new ListNode(x, tail, null);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public int pop() {
        var node = tail;
        tail.prev.next = null;
        tail = tail.prev;

        return node.val;
    }

    public int top() {
        return tail.val;
    }

    public boolean empty() {
        return tail.prev == null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */