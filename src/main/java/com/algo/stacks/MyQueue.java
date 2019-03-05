package com.algo.stacks;

public class MyQueue<T> {

    private final MyStack<T> stack;
    private final MyStack<T> stackReverse;

    public MyQueue() {

        stack = new MyStack<>();
        stackReverse = new MyStack<>();
    }

    public void add(T data) {
        stack.push(data);
    }

    public T peek() { // just returns first element of the queue
        reverseStack();
        return stackReverse.peek();
    }

    public T remove() { //removes and returns first element of the queue
        reverseStack();
        return stackReverse.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();

    }

    private void reverseStack() {
        if (stackReverse.isEmpty()) {
            while (!stack.isEmpty()) {
                stackReverse.push(stack.pop());
            }
        }
    }
}
