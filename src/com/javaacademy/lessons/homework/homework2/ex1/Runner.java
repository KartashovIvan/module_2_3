package com.javaacademy.lessons.homework.homework2.ex1;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue<Worker> workers = new LinkedList<>();
        workers.add(new Worker("Петя"));
        workers.add(new Worker("Вова"));
        workers.add(new Worker("Коля"));
        LuggageCompartment luggageCompartment = new LuggageCompartment(workers);
        luggageCompartment.planeArrival("SU-077");
        luggageCompartment.planeArrival("AO-222");
        luggageCompartment.unload();
    }
}
