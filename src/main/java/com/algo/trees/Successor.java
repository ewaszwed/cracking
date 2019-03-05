package com.algo.trees;

public class Successor {

    public TreeNode getSuccessor(TreeNode node) {

        if (node == null) {
            return null;
        }
        if (node.right != null) {

            return leftMostChild(node.right);
        } else {
            TreeNode q = node;
            TreeNode x = q.parent;

            // Go up until we're on the left instead of right
            while (x != null && x.left != q) {

                q = x;
                x = x.parent;

            }
            return x;
        }
    }

    private TreeNode leftMostChild(TreeNode node) {

        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
