/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
 public Node node;
    int data;

    public Node(int data) {
        this.data = data;
        node = null;
    }

    public Node getNode() {
        return node;
    }

    public int getData() {
        return data;
    }
}

