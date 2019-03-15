// 2.3

package com.algo.linked.lists;

public class NodeDeletion {
    
    public static boolean deleteCurrentNode(CLLNode node){
        if(node == null || node.next == null){
            return false;          
        }                  
        CLLNode nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        return true;      
    }  
}
