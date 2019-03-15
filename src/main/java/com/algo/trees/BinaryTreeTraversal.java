// excercise
package com.algo.trees;

public class BinaryTreeTraversal {

    void inOrderTraversal(TreeNode node) {

        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal(TreeNode node) {

        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(TreeNode node) {

        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    private void visit(TreeNode node) {
        System.out.println("This is our node: " + node);
    }

    public static void main(String[] args) {

        BinaryTreeTraversal trav = new BinaryTreeTraversal();

        TreeNode root = new TreeNode(15);

        root.insertInOrder(2);
        root.insertInOrder(5);
        root.insertInOrder(4);
        root.insertInOrder(9);
        root.insertInOrder(6);
        root.insertInOrder(9);
        root.insertInOrder(80);
        root.insertInOrder(90);
        root.insertInOrder(24);
        root.insertInOrder(26);
        root.insertInOrder(200);
        root.insertInOrder(29);
        root.insertInOrder(45);
        root.insertInOrder(54);
        System.out.println("IN ORDER");
        trav.inOrderTraversal(root);
        System.out.println("PRE ORDER");
        trav.preOrderTraversal(root);
        System.out.println("POST ORDER");
        trav.postOrderTraversal(root);

    }

}
