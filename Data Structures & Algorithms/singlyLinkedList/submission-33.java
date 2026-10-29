class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        ListNode current = head;

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        return current == null ? -1 : current.val;
    }

    public void insertHead(int val) {
        head = new ListNode(val, head);

        if (tail == null) {
            tail = head;
        }
    }

    public void insertTail(int val) {
        if (tail == null) {
            tail = new ListNode(val, null);
            head = tail;
        } else {
            tail.next = new ListNode(val, null);
            tail = tail.next;
        }
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }

        if (index == 0 && head.next == null) {
            head = null;
            tail = null;
            return true;
        }

        if (index == 0 && head.next != null) {
            head = head.next;
            return true;
        }

        var current = head;

        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return false;
        }

        if (current.next == tail) {
            tail = current;
            tail.next = null;
            return true;
        } 

        current.next = current.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ListNode current = head;
        ArrayList<Integer> res = new ArrayList<>();

        while (current != null) {
            res.add(current.val);
            current = current.next;
        }

        return res;
    }
}

class ListNode {
    Integer val;
    ListNode next;

    public ListNode(Integer val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}