package com.example;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name =  JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //parse convert to type
        JOptionPane.showMessageDialog(null, "Your age is "+age);
        Double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight "));
        JOptionPane.showMessageDialog(null, "Your weight is "+weight);
            
    }
}