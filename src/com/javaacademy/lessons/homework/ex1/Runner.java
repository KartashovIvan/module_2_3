package com.javaacademy.lessons.homework.ex1;

public class Runner {
    public static void main(String[] args) {
        Zoo<Bird, Dog, Tiger> zoo = new Zoo<>(new Bird(), new Dog(), new Tiger());

        zoo.getAnimalOne().fly();
        zoo.getAnimalTwo().bark();
        zoo.getAnimalThree().growl();
    }
}
