package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;

public class Review {
    private final int id;
    private static int COUNT = 1;
    private final String textReview;
    private final int numberLikes;
    private final LocalDateTime dateTime;

    public Review(String textReview, int numberLikes, LocalDateTime dateTime) {
        this.id = COUNT++;
        this.textReview = textReview;
        this.numberLikes = numberLikes;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getTextReview() {
        return textReview;
    }

    public int getNumberLikes() {
        return numberLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", textReview='" + textReview + '\'' +
                ", numberLikes=" + numberLikes +
                ", dateTime=" + dateTime +
                '}';
    }
}
