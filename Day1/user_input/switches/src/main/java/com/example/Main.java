package com.example;

public class Main {
    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Monday":
                System.out.println("Monday");

                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;

            default:
                System.out.println("None");
                break;
        }
    }
}