package com.algo.stacks;

import java.util.LinkedList;

public class AnimalsQueue {

    private static class Dog extends Animal {
        public Dog(String name){
            super(name);
        }

    };

    private static class Cat extends Animal {
        public Cat(String name){
            super(name);
        }
    };

    LinkedList<Dog> dogs;
    LinkedList<Cat> cats;

    public AnimalsQueue() {
        
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }

    public void enqueue(Animal animal) throws Exception {

        animal.setOrder();

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
            return;
        }
        if (animal instanceof Cat) {
            cats.add((Cat) animal);
            return;
        }
        throw new Exception();

    }

    public Animal dequeueAny() {
        
        Dog dog = dogs.getLast();
        Cat cat = cats.getLast();

        if (cat.getOrder() < dog.getOrder()) {
            return cat;
        } else {
            return dog;
        }

    }

    public Dog dequeueDog() {
        return dogs.getLast();

    }

    public Cat dequeueCat() {
        return cats.getLast();
    }

}
