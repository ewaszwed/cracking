// 2.2

package com.algo.linked.lists;

public class FindKthToLastElInLL {

    //recursive approach
    public int printKthToLastEl(CLLNode node, int k) {
        if (node == null) {
            return 0;
        }
        int index = printKthToLastEl(node.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is: " + node.data);
        }
        return index;
    }

    public CLLNode returnKthToLastEl(CLLNode node, int k) {

        CLLNode current = node;
        CLLNode runner = node;
        //move runner to k'th position
        for (int i = 0; i < k; i++) {
            if (runner == null) {
                return null;
            }
            runner = runner.next;
        }
        while (runner != null) {
            runner = runner.next;
            current = current.next;

        }
        return current;
    }
}
