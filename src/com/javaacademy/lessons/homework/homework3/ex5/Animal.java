package com.javaacademy.lessons.homework.homework3.ex5;

public class Animal {
    private int bodyLength;
    private int tailLength;

    public Animal(int bodyLength, int tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
}
