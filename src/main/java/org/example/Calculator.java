package org.example;

import org.example.helper.ScannerHelper;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    private ScannerHelper scannerHelper = new ScannerHelper();

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Please input the first number");

        int a = calculator.scannerHelper.returnInt();
        System.out.println("Please input the operation (- + * /)");
        String operation = calculator.scannerHelper.returnOperation();

        System.out.println("Please input the second number");
        int b = calculator.scannerHelper.returnInt();
        int result = calculator.getResult(a, operation, b);
        System.out.println("The result is " + result);

    }

    public int getResult(int a, String operation, int b) {
        switch (operation) {
            case "-":
                return a - b;
            case "+":
                return a + b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.err.println("Sorry, this is not a correct operation.");
        }
        throw new ArithmeticException("Sorry, this is not a correct operation.");
    }
}
