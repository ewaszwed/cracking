//4.6

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
    
    
    
    public static int getNthFibonacci(int n){
        
        // f(1) = 1
        // f(2) = 1
        // f(3) = 2
        // f(4) = 3
        //..
        //f(n) = f(n-1) + f(n-2)
        
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return getNthFibonacci(n-1) + getNthFibonacci(n-2);
       // f(n)
        
    }
}
