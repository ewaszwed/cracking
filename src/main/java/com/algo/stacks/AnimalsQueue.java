package com.algo.stacks;

import java.util.LinkedList;

public class AnimalsQueue {

    private static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Dog{" + "name=" + name + '}';
        }

    };

    private static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Cat{" + "name=" + name + '}';
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
            System.out.println("Ading Dog: "+ ((Dog) animal).name);
            dogs.add((Dog) animal);
            return;
        }
        if (animal instanceof Cat) {
            System.out.println("Ading Cat: "+ ((Cat) animal).name);
            cats.add((Cat) animal);
            return;
        }
        throw new Exception();

    }

    public Animal dequeueAny() {

        Dog dog = dogs.getFirst();
        Cat cat = cats.getFirst();

        if (cat.getOrder() < dog.getOrder()) {
            cats.removeFirst();
            return cat;
        } else {
            dogs.removeFirst();
            return dog;
        }

    }

    public Dog dequeueDog() {
        Dog dog = dogs.getFirst();
        dogs.removeFirst();
        return dog;

    }

    public Cat dequeueCat() {
        Cat cat = cats.getFirst();
        cats.removeFirst();
        return cat;
    }

    public static void main(String[] args) throws Exception {

        Animal kofi = new Dog("Kofi");
        Animal saba = new Dog("Saba");
        Animal filemon = new Cat("Filemon");
        Animal jack = new Cat("Jack");
        Animal azor = new Dog("Azor");

        AnimalsQueue queue = new AnimalsQueue();

        queue.enqueue(kofi);
        queue.enqueue(saba);
        queue.enqueue(filemon);
        queue.enqueue(jack);
        queue.enqueue(azor);

        System.out.println("1. We got: " + queue.dequeueCat().toString());
        System.out.println("2. We got: " + queue.dequeueDog().toString());
        System.out.println("3. We got: " + queue.dequeueAny().toString());
        System.out.println("4. We got: " + queue.dequeueAny().toString());
    }

}
