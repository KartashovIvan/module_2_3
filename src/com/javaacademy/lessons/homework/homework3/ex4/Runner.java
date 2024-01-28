package com.javaacademy.lessons.homework.homework3.ex4;
//Задание №4: Гори ясно!
//Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
//любого типа.
//Создать с помощью лямбд выражений:
//атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
//костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
public class Runner {
    public static void main(String[] args) {
        Burning<Uranus> atomicReactor = (uranus) -> System.out.println("зеленый свет вокруг!");
        Burning<Tree> bonfire = (tree) -> System.out.println("желто-красный свет вокруг!");

        atomicReactor.accept(new Uranus());
        bonfire.accept(new Tree());
    }
}
