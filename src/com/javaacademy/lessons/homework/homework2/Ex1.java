package com.javaacademy.lessons.homework.homework2;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        HashMap<Object, Object> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 1);
        Field field = map.getClass().getDeclaredField("table");
        field.setAccessible(true);
        Object o = field.get(map);
        System.out.println(o);

    }
}
