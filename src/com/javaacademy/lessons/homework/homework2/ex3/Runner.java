package com.javaacademy.lessons.homework.homework2.ex3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<Detail,Integer> map = new HashMap<>();
        Detail saw = new Detail("Пила");
        Detail hammer = new Detail("Молоток");
        Detail screwdriver = new Detail("Отвертка");

        map.put(saw, 1);
        map.put(hammer, 2);
        map.put(screwdriver, 3);

        System.out.println(map);
    }
}
