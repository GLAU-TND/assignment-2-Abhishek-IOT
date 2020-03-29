package problem2.main;

public class Tree {
    public Node root;

    public Node getRoot() {
        return root;
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.getLeftNode());
        System.out.println(node.getData());
        printInOrder(node.getRightNode());
    }

    public void printpostOrder(Node node) {
        if (node == null) {
            return;
        }
        printpostOrder(node.getRightNode());
        System.out.println(node.getData());
        printpostOrder(node.getLeftNode());
    }


}
