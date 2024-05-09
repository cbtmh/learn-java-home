package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        Integer x = scanner.nextInt();
        System.out.println("Enter y : ");
        Integer y = scanner.nextInt();
        Double z;
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Result : " + z);
        scanner.close();

    }
}