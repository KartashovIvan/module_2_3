package com.javaacademy.lessons.homework.ex1;

public class Runner {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger());
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Bird());

        for (Animal a : zoo.getAnimals()) {
            a.takeAction();
        }
    }
}
