package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Division by zero is not allowed"
            );
        }
        return a / b;
    }

    public static void main(String[] args) {

        App calculator = new App();

        System.out.println("Java CI/CD Calculator");
        System.out.println("---------------------");

        System.out.println("Addition: " +
                calculator.add(10, 5));

        System.out.println("Subtraction: " +
                calculator.subtract(10, 5));

        System.out.println("Multiplication: " +
                calculator.multiply(10, 5));

        System.out.println("Division: " +
                calculator.divide(10, 5));
    }
}