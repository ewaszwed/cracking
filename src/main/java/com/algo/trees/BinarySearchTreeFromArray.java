//4.2
package com.algo.trees;
public class BinarySearchTreeFromArray {

// function creates a binary search tree with the minimum height from sorted array    
    
    public static TreeNode produceBST(int[] array) {
        return produceBST(array, 0, array.length - 1);
    }

    private static TreeNode produceBST(int[] array, int start, int end) {
        if(end < start) return null;
        
        int middle = (start+ end) / 2;
        
        TreeNode root = new TreeNode(array[middle]);
        root.left = produceBST(array, start, middle -1);
        root.right = produceBST(array, middle+1, end);
        return root;        
    }
}
