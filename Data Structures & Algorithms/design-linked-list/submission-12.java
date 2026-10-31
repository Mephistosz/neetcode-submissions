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
    Integer size;

    public MyLinkedList() {
        this.head = new ListNode(0, null, tail);
        this.tail = new ListNode(0, head, null);
        head.next = tail;
        this.size = 0;
    }

    public ListNode getNodeAt(int index) {
        if (index > size) {
            return null;
        }

        ListNode current;

        if (size / 2 > index) {
            current = head.next;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
        } else {
            var steps = size - index;
            current = tail;
            for (int i = 0; i < steps && current != null; i++) {
                current = current.prev;
            }
        };

        return current;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        } else {
            var node = getNodeAt(index);

            return node.val;
        }
    }

    public void addAtHead(int val) {
        var node = new ListNode(val, head, head.next);
        head.next.prev = node;
        head.next = node;
        size++;
    }

    public void addAtTail(int val) {
        var node = new ListNode(val, tail.prev, tail);
        tail.prev.next = node;
        tail.prev = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        var current = getNodeAt(index);
        var node = new ListNode(val, current.prev, current);
        current.prev.next = node;
        current.prev = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }

        var current = getNodeAt(index);
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