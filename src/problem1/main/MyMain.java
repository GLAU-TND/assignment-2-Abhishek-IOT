/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {


        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.root = new TreeNode(5);
        myBinarySearchTree.root = new TreeNode(10);
        myBinarySearchTree.root = new TreeNode(15);
        System.out.println("Print in inorder");
        myBinarySearchTree.printInorder(myBinarySearchTree.root);

    }
}
