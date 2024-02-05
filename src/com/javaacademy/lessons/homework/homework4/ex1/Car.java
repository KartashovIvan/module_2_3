package com.javaacademy.lessons.homework.homework4.ex1;

public class Car {
    private final String carNumber;

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                '}';
    }
}
