package com.algo.trees;

// functions checks if given binary tree is a binary search tree

public class BSTCheck {
    
    public static boolean checkIfBST(TreeNode node){
        if (node == null) return false;
        Integer min = null; //no limits yet
        Integer max = null; //no limits yet     
        return checkIfBST(node, min, max);
    }

    private static boolean checkIfBST(TreeNode node, Integer min, Integer max){
        
        if(min != null){
            if (node.data < min) return false;
        }
        if(max != null){
            if(node.data > max) return false;           
        }
        if(!checkIfBST(node.left, min, node.data) || !checkIfBST(node.right, node.data, max)){
            return false;
        }
        return true;    
    }
}
