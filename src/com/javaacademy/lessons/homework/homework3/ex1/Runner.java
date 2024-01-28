package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Comparator<Review> reviewComparator =(o1,o2)-> {
            if(o1.getNumberLikes() == o2.getNumberLikes()){
                return o2.getDateTime().compareTo(o1.getDateTime());
            }
            return o2.getNumberLikes() - o1.getNumberLikes();
        };

        TreeSet<Review> reviews = new TreeSet<>(reviewComparator);
        reviews.add(new Review("отличный товар",200, LocalDateTime.of(2024,1,25, 13,37)));
        reviews.add(new Review("так себе товар",100, LocalDateTime.of(2024,1,25, 16,37)));
        reviews.add(new Review("плохой товар",100, LocalDateTime.of(2024,1,25, 13,37)));
        System.out.println(reviews);
    }
}
