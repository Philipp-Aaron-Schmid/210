package com.example.calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Quotient: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
