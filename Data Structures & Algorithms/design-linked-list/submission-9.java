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

class MyLinkedList {
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        head = new ListNode(0, null, null);
        tail = new ListNode(0, head, null);
        head.next = tail;
    }

    public int get(int index) {
        var current = head.next;

        for (int i = 0; i < index && current != tail; i++) {
            current = current.next;
        }

        return current == tail ? -1 : current.val;
    }

    public void addAtHead(int val) {
        var node = new ListNode(val, head, head.next);
        head.next.prev = node;
        head.next = node;
    }

    public void addAtTail(int val) {
        var node = new ListNode(val, tail.prev, tail);
        tail.prev.next = node;
        tail.prev = node;
    }

    public void addAtIndex(int index, int val) {
        var current = head.next;

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            var node = new ListNode(val, current.prev, current);
            current.prev.next = node;
            current.prev = node;
        }
    }

    public void deleteAtIndex(int index) {
        var current = head.next;

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current != null && current != tail) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */