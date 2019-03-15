//2.8

package com.algo.linked.lists;

import java.util.HashSet;
import java.util.Set;

public class LoopDetector {

    public static CLLNode getLoopStartNode(CLLNode head) {

        CLLNode current = head;

        while (current != null && current.next != null) {
            CLLNode runner = current.next;
            while (runner != null) {
                if (current == runner) {
                    return current;
                }
                runner = runner.next;
            }
            current = current.next;
        }
        return null;
    }

    public static CLLNode getLoopStartNodeFaster(CLLNode head) {

        Set<CLLNode> uniques = new HashSet<CLLNode>();

        while (head != null) {

            if (uniques.contains(head)) {
                return head;
            } else {
                uniques.add(head);
            }
            head = head.next;
        }
        return null;

    }

}
