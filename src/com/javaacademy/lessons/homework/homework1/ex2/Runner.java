package com.javaacademy.lessons.homework.homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №2
        //Создать два List с числами
        //Первый List: 5,2,4
        //Второй List: 7,10
        //Создать финальный лист и заполнить его данными из первого и второго листа,
        // не используя for each.
        //Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.
        List<Integer> list1 = List.of(5, 2, 4);
        List<Integer> list2 = List.of(7, 10);
        ArrayList<Integer> finalList = new ArrayList<>(list1);
        finalList.addAll(list2);
        finalList.remove(2);
        int index = finalList.indexOf(Integer.valueOf(10));
        finalList.indexOf(10);
        System.out.println(index);
    }
}
