package com.example;

public class Main {
    public static void main(String[] args) {
        String name = "vu";
        //boolean result = name.equals("Vu");
       // boolean result = name.contentEquals("Vu");
       //boolean result = name.equalsIgnoreCase("Vu");
       //int result = name.indexOf("o"); // check this string has this alphabet or not
       //boolean result =name.isEmpty();
       //String result = name.toLowerCase(); // lower
      // String result = name.toUpperCase(); // upper
      // String result = name.trim(); //delete spaces in the begin and in the end
      String result = name.replace("u", "a");
        System.out.println(result);
    }
}