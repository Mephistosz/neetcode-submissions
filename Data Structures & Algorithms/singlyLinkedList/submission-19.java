class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        var current = head;

        if (head == null) {
            return -1;
        }

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return current.getValue();
            }

            if (current.getNext() == null) {
                return -1;
            }
            current = current.getNext();
        }

        return -1;
    }

    public void insertHead(int val) {
        if (head == null) {
            var newNode = new Node(val, null);
            head = newNode;
            tail = newNode;
        } else {
            var newNode = new Node(val, head);
            head = newNode;
        }
    }

    public void insertTail(int val) {
        if (tail == null) {
            var newNode = new Node(val, null);
            head = newNode;
            tail = newNode;
        } else {
            var newNode = new Node(val, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int index) {
        var current = head;

        if (current == null) {
            return false;
        }

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return true;
        }

        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                return false;
            }

            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        if(current.next == tail){
            tail = current;
        }

        current.next = current.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        var current = head;

        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }

        return list;
    }
}

class Node {
    Integer value;
    Node next;

    public Node() {}

    public Node(Integer value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
