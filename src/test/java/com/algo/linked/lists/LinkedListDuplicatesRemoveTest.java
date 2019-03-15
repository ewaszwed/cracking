package com.algo.linked.lists;

import java.util.LinkedList;
import static org.junit.Assert.*;

public class LinkedListDuplicatesRemoveTest {

    public LinkedListDuplicatesRemoveTest() {
    }

    @org.junit.Test
    public void LinkedListDRTest_noDuplicates() {
        LinkedList<Integer> input = createLL(1, 2, 4);
        LinkedList<Integer> result = LinkedListDuplicatesRemove.deleteDuplicates(input);
        LinkedList<Integer> expectedResult = createLL(1, 2, 4);
        assertEquals(expectedResult, result);
    }

    @org.junit.Test
    public void LinkedListDRTest_noDuplicatesBig() {
        LinkedList<Integer> input = createLL(0,1,2,4,80,3,55,61,342,564,345);
        LinkedList<Integer> result = LinkedListDuplicatesRemove.deleteDuplicates(input);
        LinkedList<Integer> expectedResult = createLL(0,1,2,4,80,3,55,61,342,564,345);
        assertEquals(expectedResult, result);
    }
    
    
        @org.junit.Test
    public void LinkedListDRTest_duplicatesBig() {
        LinkedList<Integer> input = createLL(0,1,2,4,80,3,55,61,61,342,80,564,345,4);
        LinkedList<Integer> result = LinkedListDuplicatesRemove.deleteDuplicates(input);
        LinkedList<Integer> expectedResult = createLL(0,1,2,4,80,3,55,61,342,564,345);
        assertEquals(expectedResult, result);
    }

    private LinkedList<Integer> createLL(int... x) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : x) {
            list.add(i);
        }
        return list;
    }
}
