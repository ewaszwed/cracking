package com.algo.linked.lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListDuplicatesRemove {

    void deleteDups(CLLNode node) {
        HashSet<Integer> set = new HashSet<>();
        CLLNode previous = null;

        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;

            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    void deleteDupsNoBuffer(CLLNode node) {
        CLLNode current = node;
        while (current != null) {
            CLLNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static LinkedList<Integer> deleteDuplicates(LinkedList<Integer> input) {
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(input);
        return new LinkedList<>(unique);
    }
}
