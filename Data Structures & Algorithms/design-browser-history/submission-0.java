class ListNode {
    String val;
    ListNode prev;
    ListNode next;

    public ListNode(String val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class BrowserHistory {
    ListNode current;

    public BrowserHistory(String homepage) {
        current = new ListNode(homepage,null,null);
    }

    public void visit(String url) {
        current.next = new ListNode(url, current, null);
        current = current.next;
    }
    public String back(int steps) {
        ListNode curr = current;

        while (steps > 0 && curr != null && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }

        current = curr;

        return curr.val;
    }

    public String forward(int steps) {
        ListNode curr = current;

        while (steps > 0 && curr != null && curr.next != null) {
            curr = curr.next;
            steps--;
        }

        current = curr;

        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */