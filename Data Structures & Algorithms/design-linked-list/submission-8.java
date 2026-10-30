class MyLinkedList {
    int size = 0;
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        ListNode current = head;

        if (current == null || index >= size) {
            return -1;
        }

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current == null ? -1 : current.val;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode(val, null, null);
            tail = head;
        } else {
            var node = new ListNode(val, null, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            tail = new ListNode(val, null, null);
            head = tail;
        } else {
            var node = new ListNode(val, tail, null);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode current = head;

        if (index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        ListNode node = new ListNode(val, current.prev, current);
        current.prev.next = node;
        current.prev = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        ListNode current = head;

        if (index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }

            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
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