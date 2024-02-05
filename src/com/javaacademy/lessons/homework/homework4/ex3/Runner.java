package com.javaacademy.lessons.homework.homework4.ex3;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = List.of(new Skyscraper("Всемирный торговый центр 1", 541)
                , new Skyscraper("Шанхайская башня", 632)
                , new Skyscraper("Бурдж-Халифа", 828)
                , new Skyscraper("Международный финансовый центр Пинань", 599)
                , new Skyscraper("Абрадж аль-Бейт", 601)
                , new Skyscraper("Всемирный центр Лотте", 555)
                , new Skyscraper("Бурдж-Халифа", 828));

        removeDuplicates(skyscrapers);
        System.out.println("---------------------------------------------------");

        printFirstThree(skyscrapers);
        System.out.println("---------------------------------------------------");

        printHighest(skyscrapers);
        System.out.println("---------------------------------------------------");

        printHighestThanKilometer(skyscrapers);
    }

    public static void removeDuplicates(List<Skyscraper>skyscrapers) {
        skyscrapers.stream()
                .distinct()
                .forEach(System.out::println);
    }


    public static void printFirstThree(List<Skyscraper>skyscrapers) {
        skyscrapers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    public static void printHighest(List<Skyscraper>skyscrapers) {
        System.out.println(skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .get());
    }

    public static void printHighestThanKilometer(List<Skyscraper>skyscrapers) {
        String s = skyscrapers.stream()
                .distinct()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .map(Skyscraper::getName)
                .reduce((skyscraperOne, skyscraperTwo) -> skyscraperOne + ", " + skyscraperTwo)
                .orElse("небоскреба выше километра - нет.");
        System.out.println(s);
    }

}
