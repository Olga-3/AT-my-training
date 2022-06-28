package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Calculator2 {
    private static boolean numberIsValid=true;
    private static boolean operationIsCorrect=true;

    private static int returnInt() {
        Scanner scanner1 = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("This is not a number");
            numberIsValid = false;
        }
        return 0;
    }
    private static String returnOperation() {
        Scanner scanner1 = new Scanner(System.in);
        try {
            if(Objects.equals(scanner1.nextLine(), "-")||Objects.equals(scanner1.nextLine(), "+")||Objects.equals(scanner1.nextLine(), "*")||Objects.equals(scanner1.nextLine(), "/")) {
                return scanner1.nextLine();
                //operationIsCorrect = true;
            }
            else {
                System.err.println("This is not a correct operation");
            }
        } catch (NumberFormatException e) {
            System.err.println("This is not a correct operation");
            operationIsCorrect = false;
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number");


        int a = returnInt();

        if(numberIsValid) {

            System.out.println("Please input the operation (- + * /)");
            //String operation = input.nextLine();
            String operation = returnOperation();
            if (!operationIsCorrect) {

                System.out.println("Please input the second number");
                int b = returnInt();
                int result = 0;
                switch (operation) {
                    case "-":
                        result = a - b;
                        break;
                    case "+":
                        result = a + b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    default:
                        System.err.println("Sorry, this is not a correct operation.");
                }
                System.out.println("The result is " + result);
            }
        }
        else {
            System.out.println(numberIsValid);
            System.out.println("Please try again with valid numbers and a valid operation (- + * /)");
        }

    }
}
