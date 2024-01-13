package com.javaacademy.lessons.homework.ex1;

import java.util.ArrayList;

public class Zoo<T extends Animal> {
    private final ArrayList<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }
}
