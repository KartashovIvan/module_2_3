package com.javaacademy.lessons.homework.ex3;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Stock stock = new Stock();

        items.add(new Item("Flour"));
        items.add(new Item("Bread"));
        items.add(new Item("Water"));
        items.add(new Item("Oil"));
        items.add(new Item("Juice"));
        items.add(new Item("Sugar"));

        stock.addAllItems(items);
        System.out.println(stock.getItems());
        System.out.println(stock.getItem(3));
        stock.lastOne();
    }
}
