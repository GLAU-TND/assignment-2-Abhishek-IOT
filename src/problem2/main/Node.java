package problem2.main;

public class Node {
    Node leftNode = null;
    Node rigthNode = null;
    int data;

    public Node(int data) {
        this.leftNode = null;
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rigthNode;
    }

    public int getData() {
        return data;
    }

}
