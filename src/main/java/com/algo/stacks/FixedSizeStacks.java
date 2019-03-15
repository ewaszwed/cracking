// 3.1
package com.algo.stacks;

public class FixedSizeStacks {

    private final int numOfStacks = 3;
    private final int stackCapacity;

    int[] sizes;
    int[] values;

    public FixedSizeStacks(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numOfStacks];
        sizes = new int[numOfStacks];
    }

    public int pop(int stackNum) throws Exception { //removes the element

        if (isEmpty(stackNum)) {
            //throw new EmptyStackException();            
        }
        int value = getTopIndex(stackNum);
        values[getTopIndex(stackNum)] = 0;
        sizes[stackNum]--;
        return value;

    }

    public void push(int stackNum, int value) throws Exception {

        if (isFull(stackNum)) {
            //throw new FullStackException();            
        }
        sizes[stackNum]++;
        values[getTopIndex(stackNum)] = value;
    }

    public int peek(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            //throw new EmptyStackException();            
        }

        return values[getTopIndex(stackNum)];
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;

    }

    private int getTopIndex(int stackNum) throws Exception { // 0,1,2,
        if (stackNum >= numOfStacks) {
            throw new Exception();
        }
        return stackNum * stackCapacity + sizes[stackNum];
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

}
