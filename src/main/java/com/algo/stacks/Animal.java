package com.algo.stacks;

public class Animal {

    protected final String name;
    protected int order;   
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

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
   
}
