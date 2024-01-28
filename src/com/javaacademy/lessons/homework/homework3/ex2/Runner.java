package com.javaacademy.lessons.homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> new Apple();
        Garden<Apricot> appleApricot = () -> new Apricot();
    }
}
