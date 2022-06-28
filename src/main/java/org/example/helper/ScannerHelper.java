package org.example.helper;

import java.util.Objects;
import java.util.Scanner;

public class ScannerHelper {
    public int returnInt() {
        Scanner scanner1 = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner1.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("This is not a number. Please input a number");
        }
        return returnInt();
    }

    public String returnOperation() {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();
        if (Objects.equals(input, "-") || Objects.equals(input, "+") ||
                Objects.equals(input, "*") || Objects.equals(input, "/")) {
            return input;
        }
        System.err.println("This is not a correct operation. Please try again");
        return returnOperation();
    }

}
