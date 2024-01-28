package com.javaacademy.lessons.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0;
        Divination<Human> fortuneTeller = human -> human.getAge() + human.getHeight() > 210;
    }
}
