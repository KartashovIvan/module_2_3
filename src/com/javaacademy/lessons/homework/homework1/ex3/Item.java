package com.javaacademy.lessons.homework.homework1.ex3;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
