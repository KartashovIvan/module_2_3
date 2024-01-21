package com.javaacademy.lessons.homework.homework1.ex1;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Bird bird = new Bird();
        Zoo<Dog, Tiger, Bird> zoo = new Zoo<>(dog, tiger, bird);
        Dog animal1 = zoo.getAnimal1();
        Tiger animal2 = zoo.getAnimal2();
        Bird animal3 = zoo.getAnimal3();
        animal1.bark();
        animal2.growl();
        animal3.fly();
    }
}
