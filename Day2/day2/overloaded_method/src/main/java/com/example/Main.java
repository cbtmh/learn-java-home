package com.example;

public class Main {
    public static void main(String[] args) {
        //overloaded method = method that share the same name but has different paramenters method name + paramenters = method signature
        int x = sum(11,12,13);
        System.out.println(x);
    }

    static int sum(int a, int b){
        System.out.println("this is method #1");
        return a+b;
    }
    static int sum(int a, int b, int c){
        System.out.println("this is method #2");
        return a+b+c;
    }
    static int sum(int a, int b,int c, int d){
        System.out.println("this is method #3");
        return a+b+c+d;
    }
}