package com.algo.trees;

import com.algo.stacks.MyQueue;

public class GraphSearch {

    private void deapthFirstSearch(GraphNode node) {
        if (node == null) {
            return;
        }
        visit(node);
        node.visited = true;
        for (GraphNode child : node.nodes) {

            if (child.visited == false) {
                deapthFirstSearch(child);
            }
        }
    }

    private void breadthFirstSearch(GraphNode node) {

        MyQueue queue = new MyQueue();
        node.visited = true;
        queue.add(node);
        while (!queue.isEmpty()) {

            GraphNode n = (GraphNode) queue.remove();
            visit(n);
            for (GraphNode child : n.nodes) {
                if (!n.visited) {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }
    }

    private void visit(GraphNode node) {
        System.out.println("Node: " + node.data);
    }

}
