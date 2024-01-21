package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.Queue;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwLuggage(Queue<Suitcase> suitcases) {
        System.out.println(name + ": Мужики, кидаю чемодан " + suitcases.remove().getNumberOfFlight());
    }
}
