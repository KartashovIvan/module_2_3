package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void unload(Queue<Luggage> luggages) {
        if (!luggages.isEmpty()) {
            System.out.printf("%s: Мужики, кидаю чемодан %s\n", name, luggages.poll().getFlightNumber());
        }
    }
}
