package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class LuggageCompartment {
    private final Queue<Suitcase> suitcaseSet;
    private final Queue<Worker> workers;

    public LuggageCompartment(Queue<Worker> workers) {
        this.suitcaseSet = new LinkedList<>();
        this.workers = workers;
    }

    public void planeArrival(String numberOfFlight) {
        for (int i = 0; i < 20; i++) {
            suitcaseSet.add(new Suitcase(numberOfFlight));
        }
    }

    public void unload() {
        while (suitcaseSet.size() > 0){
            Worker worker = workers.remove();
            worker.throwLuggage(suitcaseSet);
            workers.add(worker);
        }
    }
}
