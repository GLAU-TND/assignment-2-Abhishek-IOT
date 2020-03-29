package problem2.main;

public class Node {
    Node next = null;
    int data;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
