package com.example;

public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            greeting = "Hello, " + String.join(", ", args) + "!";
        }

        System.out.println(greeting);
    }
}