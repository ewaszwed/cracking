package com.algo.recursion;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Hanoi {

    private Stack<Integer> disks;
    private int index;

    public Hanoi(int i) {
        disks = new Stack<>();
        index = i;
    }

    public int index() {
        return index;
    }

    public void add(int d) {
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing " + d);
        } else {
            disks.push(d);
        }
    }

    public void moveTopTo(Hanoi t) {
        int top = disks.pop();
        System.out.println("Moving top disk " + top + " from Hanoi " + this.index + "to Hanoi " +t.index);
        t.add(top);
    }

    public void moveDisks(int n, Hanoi dest, Hanoi buffer) {
        System.out.println("Moving disk " + n + " from Hanoi " + dest.index + " to Hanoi " + buffer.index);
        if (n > 0) {
            moveDisks(n - 1, buffer, dest);
            moveTopTo(dest);
            buffer.moveDisks(n - 1, dest, this);
        }
    }

    public void printStack() {

        System.out.println("Elements in Hanoi " + index);
        Iterator iter = disks.elements().asIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void main(String[] args) {

        int n = 3;

        Hanoi[] towers = new Hanoi[n];

        for (int i = 0; i < n; i++) {
            towers[i] = new Hanoi(i);
        }

        for (int i = 9; i >= 0; i--) {
            towers[0].add(i);
        }

        towers[0].printStack();
        towers[1].printStack();
        towers[2].printStack();

        towers[0].moveDisks(10, towers[2], towers[1]);

        towers[0].printStack();
        towers[1].printStack();
        towers[2].printStack();

    }
}
