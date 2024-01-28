package com.javaacademy.lessons.homework.homework3.ex5;

//Задание №5: универсальная линейка
//Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
//Создать с помощью лямбд выражений:
//Измеритель лодок: на вход лодка(длина), возвращает длину лодки
//Измеритель животных: на вход животное(длина тела, длина хвоста),
//возвращает сумму длин тела и хвоста
public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatMeter = boat -> boat.getLength();
        Ruler<Animal> animalMeter = animal -> animal.getBodyLength() + animal.getTailLength();

        System.out.println(boatMeter.measure(new Boat(200)));
        System.out.println(animalMeter.measure(new Animal(10,15)));
    }
}
