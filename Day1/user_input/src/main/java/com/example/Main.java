package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        System.out.println("how old are you " + name);
        Integer age = scanner.nextInt();
        System.out.println("I am " + age);
        scanner.close();
    }
}