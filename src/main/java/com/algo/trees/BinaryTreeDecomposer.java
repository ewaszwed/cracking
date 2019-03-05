package com.algo.trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreeDecomposer {

    private class TreeNode<T> {

        public T data;
        TreeNode<T> left;
        TreeNode<T> right;
    }

    void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {

        if (root == null) {
            return;
        }
        LinkedList<TreeNode> levelList = null;

        if (lists.size() == level) {
            levelList = new LinkedList<>();
            lists.add(levelList);
        } else {
            levelList = lists.get(level);
        }
        levelList.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);

    }

    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists, 0);
        return lists;

    }

}
