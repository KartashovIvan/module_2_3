package com.javaacademy.lessons.homework.ex3;

import java.util.ArrayList;

public class Stock {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addAllItems(ArrayList<Item> listItem) {
        items.addAll(listItem);
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> newListItems = new ArrayList<>();
        for (Item item : items) {
            if (items.indexOf(item) % 2 == 0) {
                newListItems.add(item);
            }
        }
        return newListItems;
    }

    public Item getItem(int index) {
        return items.remove(index);
    }

    public void lastOne() {
        Item item = items.get(items.size() - 1);
        items.clear();
        items.add(item);
    }
}
