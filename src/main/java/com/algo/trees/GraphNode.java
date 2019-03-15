package com.algo.trees;

public class GraphNode<T> {
    T data;
    GraphNode<T>[] nodes;
    boolean visited;

    public GraphNode(T data) {
        this.data = data;
    }
}
