package com.algo.linked.lists;

//simple implementation of singly linked LinkedListNode
public class CLLNode {

    CLLNode next = null;
    int data;

    public CLLNode(int d) {
        data = d;
    }

    void appendToTail(int d) {
        CLLNode endNode = new CLLNode(d);
        CLLNode currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = endNode;
    }

    CLLNode deleteNode(CLLNode head, int data) {
        if (head.data == data) {
            return head.next;
        }
        while (head.next != null) {
            if (head.next.data == data) {
                head.next = head.next.next;
                return head;
            }
            head = head.next;
        }
        return head;
    }
}
