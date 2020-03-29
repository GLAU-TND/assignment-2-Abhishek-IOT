package problem2.main;

import problem1.node.TreeNode;

public class Tree {
    public Node root;

    public Node getRoot() {
        return root;
    }

    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.getLeftNode());
        System.out.println(node.getData());
    }
}
