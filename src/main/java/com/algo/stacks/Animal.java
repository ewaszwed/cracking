package com.algo.stacks;

public class Animal {

    private final String name;
    private int order;   
    static int globalOrder = 0;
    
    public Animal(String name) {
       this.name = name;
    }
    private static void incrementGlobalOrder(){
        globalOrder++;
    }
    
    public void setOrder(){
        order = globalOrder;
        incrementGlobalOrder();       
    }
    public int getOrder(){
        return order;
    }
}
