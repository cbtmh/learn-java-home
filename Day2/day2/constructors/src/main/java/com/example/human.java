package com.example;

public class human {
    String name;
    int age;
    double weight;

    human(String name,int age,double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void run(){
        System.out.println(this.name+" is running");
    }
}
