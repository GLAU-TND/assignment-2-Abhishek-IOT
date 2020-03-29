package problem2.main;

public class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
