package com.algo.trees;

public class TreeNode {

    public int data;
    public TreeNode left, right, parent;
    private int size;

    public TreeNode(int d) {
        data = d;
        size = 1;
    }

    public void insertInOrder(int d) {
        if (d < data) {
            if (left == null) {
                setLeftChild(new TreeNode(d));
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(d));
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public TreeNode find(int d) {
        if (d == data) {
            return this;
        } else if (d < data) {
            return left != null ? left.find(d) : null;

        } else if (d > data) {
            return right != null ? right.find(d) : null;
        }
        return null;

    }

    public void setLeftChild(TreeNode node) {
        this.left = node;
        if (node != null) {
            node.parent = this;
        }
    }

    public void setRightChild(TreeNode node) {
        this.right = node;
        if (node != null) {
            node.parent = this;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "data=" + data + ", size=" + size + '}';
    }
     
}
