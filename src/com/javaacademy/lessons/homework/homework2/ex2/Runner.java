package com.javaacademy.lessons.homework.homework2.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Item apple = new Item("Яблоко");
        Item banana = new Item("Банан");
        Item orange = new Item("Апельсин");


        Map<Item,Integer> map = new HashMap<>();
        map.put(apple,1);
        map.put(banana,2);
        map.put(orange,3);

        System.out.println(map.get(orange));
        System.out.println(map);
    }
}
