package com.algo.stacks;

public class MyStack<T> {

    private MyStackNode<T> top;

    public void push(T data) {
        if (top != null) {
            top.next = top;
        }
        top = new MyStackNode(data);
    }

    public T peek() { // returns the node data
        if (top != null) {
            return top.data;

        }
        return null;
    }

    public T pop() { //returns and removes
        if (top != null) {
            T data = top.data;
            if (top.next != null) {
                top = top.next;
            }
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return top == null;

    }

}
