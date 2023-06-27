package oop;

public class Calculator {

    // Statická metóda na sčítanie dvoch čísel
    public static int add(int a, int b) {
        return a + b;
    }

    // Statická metóda na odčítanie dvoch čísel
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Statická metóda na násobenie dvoch čísel
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Statická metóda na delenie dvoch čísel
    public static double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Deliteľ nesmie byť nula");
        }
        return result;
    }

    // Statická metóda na výpočet faktoriálu čísla
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktoriál je definovaný len pre nezáporné celé čísla.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Hlavná metóda na testovanie
    public static void main(String[] args) {
        int sum = Calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);  // Výstup: 5 + 3 = 8

        int difference = Calculator.subtract(10, 7);
        System.out.println("10 - 7 = " + difference);  // Výstup: 10 - 7 = 3

        int product = Calculator.multiply(4, 6);
        System.out.println("4 * 6 = " + product);  // Výstup: 4 * 6 = 24

        double quotient = Calculator.divide(15, 0);
        System.out.println("15 / 3 = " + quotient);  // Výstup: 15 / 3 = 5.0

        int factorialResult = Calculator.factorial(5);
        System.out.println("5! = " + factorialResult);  // Výstup: 5! = 120
    }
}
