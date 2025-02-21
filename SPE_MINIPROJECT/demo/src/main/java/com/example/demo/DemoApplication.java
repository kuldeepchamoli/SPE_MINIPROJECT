package com.example.demo;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\n");
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (x) for square root: ");
                    double x = scanner.nextDouble();
                    double result = squareRoot(x);
                    System.out.println("Square root of " + x + " is: " + result);
                    break;
                case 2:
                    System.out.print("Enter a number (x) for factorial: ");
                    int y = scanner.nextInt();
                    long result1 = factorial(y);
                    System.out.println("Factorial of " + y + " is: " + result1);
                    break;
                case 3:
                    System.out.print("Enter a number (x) for natural logarithm: ");
                    double a = scanner.nextDouble();
                    double result2 = naturalLogarithm(a);
                    System.out.println("Natural logarithm of " + a + " is: " + result2);
                    break;
                case 4:
                    System.out.print("Enter the base (x) for the power function: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter the exponent (b) for the power function: ");
                    double c = scanner.nextDouble();
                    double result3 = powerFunction(b, c);
                    System.out.println(b + " raised to the power " + c + " is: " + result3);
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);
        scanner.close();
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLogarithm(double x) {
        double result = Math.log(x);
        return result;
    }

    public static double powerFunction(double x, double b) {
        double result = Math.pow(x, b);
        return result;
    }
}
