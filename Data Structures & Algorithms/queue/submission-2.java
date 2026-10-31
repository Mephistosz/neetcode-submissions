class ListNode {
    Integer val;
    ListNode next;

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Deque {
    ListNode head;
    ListNode tail;

    public Deque() {
        this.head = new ListNode(0, null);
        this.tail = this.head;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void append(int value) {
        var node = new ListNode(value, null);

        tail.next = node;
        tail = node;
    }

    public void appendleft(int value) {
        var node = new ListNode(value, head.next);
        if (head == tail)
            tail = node;
        head.next = node;
    }

    public int pop() {
        var current = head;

        while (current != null && current.next != tail) {
            current = current.next;
        }

        if (current != null && (current.next == tail)) {
            int x = current.next.val;
            current.next = null;
            tail = current;
            return x;
        }

        return -1;
    }


    public int popleft() {
        if (head.next == null) {
            return -1;
        }

        int x = head.next.val;
        
        if(head.next == tail){
            tail=head;
        }

        head.next = head.next.next;
        return x;
    }

}
