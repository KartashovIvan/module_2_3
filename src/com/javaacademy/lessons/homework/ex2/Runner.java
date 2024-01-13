package com.javaacademy.lessons.homework.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> listOne = List.of(5, 2, 4);
        List<Integer> listTwo = List.of(7, 10);

        ArrayList<Integer> finalList = new ArrayList<>(listOne);
        finalList.addAll(listTwo);
        finalList.removeAll(listOne);

        System.out.println("Индекс числа 10 - " + finalList.indexOf(10));
    }
}
