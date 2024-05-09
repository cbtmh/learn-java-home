package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("bread");
        food.add("noodle");
        food.add("sashimi");
        food.set(0, "noodle");
        food.remove(1);
        System.out.println(food);

    }
}