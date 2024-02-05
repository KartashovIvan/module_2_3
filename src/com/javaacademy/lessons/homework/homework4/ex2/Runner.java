package com.javaacademy.lessons.homework.homework4.ex2;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List.of("тонь", "тополь", "боль", "рой", "стройка").stream()
                .map(word -> Arrays.stream(word.split(""))
                        .filter(o -> o.equals("о"))
                        .count())
                .reduce(Long::sum)
                .ifPresent(Runner::checkValue);
    }

    public static void checkValue(long value) {
        if (value < 1) {
            throw new RuntimeException("Колличество букв 'о' равно нулю");
        }
        System.out.println(value);
    }
}
