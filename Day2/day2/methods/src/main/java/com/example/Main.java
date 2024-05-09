package com.example;

public class Main {
    public static void main(String[] args) {
        String name = "Vu";
        Integer age = 20;
        hello(name, age);
    }

    static void hello(String name, Integer age){
        System.out.println("hello " + name +" you are "+ age+ " years old") ;
    }
}

