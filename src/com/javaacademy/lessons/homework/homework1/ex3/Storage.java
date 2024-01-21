package com.javaacademy.lessons.homework.homework1.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Storage {
    private List<Item> items = new ArrayList<>();

    public Storage(List<Item> items) {
        this.items.addAll(items);
    }

    public List<Item> getItems() {
        ArrayList<Item> tempList = new ArrayList<>();
        for (int i = 0; i < items.size(); i += 2) {
            tempList.add(items.get(i));
        }
        return tempList;
    }

    public Item getItem(int index) {
        return items.remove(index);
    }

    public void clearWithoutLast() {
        Item item = items.get(items.size() - 1);
        items.clear();
        items.add(item);
    }
}
