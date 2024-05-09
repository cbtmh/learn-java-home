package com.example;

public class Main {
    public static void main(String[] args) {
        noodle Noodle = new noodle("cold noodle", "spicy", "sausage");
        System.out.println("Your ingredients's noodle are :");
        System.out.println(Noodle.type);
        System.out.println(Noodle.sauce);
        System.out.println(Noodle.topping);
    }
}