package com.algo.stacks;
public class MyStackNode<T> {
    T data;
    MyStackNode<T> next = null;

    public MyStackNode(T data) {
        this.data = data;
    }  
}
