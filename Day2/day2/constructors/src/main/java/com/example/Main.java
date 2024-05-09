package com.example;

public class Main {
    public static void main(String[] args) {
        human human1 = new human("vu", 10, 56.5);
        System.out.println(human1.name);

        human1.run();
    }
}