package com.javaacademy.lessons.homework.homework4.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Stream<Car> aNumber = generateNumberCar("а0", "ан799");
        Stream<Car> kNumber = generateNumberCar("к0", "се178");
        System.out.println(Stream.concat(aNumber, kNumber)
                .map(Car::getCarNumber)
                .filter(carNumber -> String.valueOf(carNumber.charAt(2)).equals("4"))
                .collect(Collectors.joining(", ")));
    }

    public static Stream<Car> generateNumberCar(String beginningNumber, String endNumber) {
        AtomicInteger counter = new AtomicInteger();
        return Stream.generate(() -> new Car(beginningNumber + String.format("%02d", counter.addAndGet(1)) + endNumber))
                .limit(50);
    }
}
