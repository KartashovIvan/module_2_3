package com.javaacademy.lessons.homework.ex1;

public class Zoo<A extends Animal,B extends Animal,C extends Animal> {
    private final A animalOne;
    private final B animalTwo;
    private final C animalThree;

    public Zoo(A animalOne, B animalTwo, C animalThree) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.animalThree = animalThree;
    }

    public A getAnimalOne() {
        return animalOne;
    }

    public B getAnimalTwo() {
        return animalTwo;
    }

    public C getAnimalThree() {
        return animalThree;
    }
}
