package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageDepartment {
    private final List<Worker> workers = List.of(
            new Worker("Юрий"),
            new Worker("Петр"),
            new Worker("Иван")
    );
    private Queue<Luggage> luggages = new LinkedList<>();

    public void arriveLuggage(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            luggages.add(new Luggage(flightNumber));
        }
    }

    public void unloadAllLuggage() {
        while (!luggages.isEmpty()) {
            unloadHelper();
        }
    }

    private void unloadHelper() {
        for (Worker worker : workers) {
//            worker.unload(luggages);
//            if (luggages.isEmpty()) {
//                return;
//            }
        }
    }
}
