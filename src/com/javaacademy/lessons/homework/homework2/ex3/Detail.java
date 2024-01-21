package com.javaacademy.lessons.homework.homework2.ex3;

public class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "detail(" + name +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
