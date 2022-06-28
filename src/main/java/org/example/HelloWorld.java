package org.example;

//чтобы увидеть все похожие по написанию методы, поставить курсор на метод ("println", например) и Ctrl+Space
//чтобы увидеть реализацию метода, Ctrl и кликнуть на метод
//поставить курсор на скобки или внутри скобок, Ctrl+P - покажет, какие параметры принимает метод
//поставить курсор на скобки или внутри скобок, Ctrl+Q - покажет документацию на этот метод
//поставить правильно отступы автоматически - Ctrl+Alt+L
//переименовать имя метода во всем проекте - Shift+F6
//закомментить выделенный код - в англ раскладке Ctrl+/

import java.util.Objects;
import java.util.Scanner;

/**
 * a program that prints <code>Hello world!</code>
 * @author Olga
 * @version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        String system_login = "1";
        String system_pass = "2";
        Scanner input_message = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your login");

        String input_login = input_message.nextLine();  // Read user input
        System.out.println("The login you tried is: " + input_login);

        Scanner input_message2 = new Scanner(System.in);
        System.out.println("Please enter your pass");
        String input_pass = input_message2.nextLine();
        System.out.println("The pass you tried is: " + input_pass);

        if(Objects.equals(input_login, system_login) && Objects.equals(input_pass, system_pass)) {
            System.out.println("Successful authorization!");
        }
        else {
            System.out.println("Either your login or your pass is not correct. Please try again.");
        }
            }
}

//import java.security.MessageDigest;

//public class HelloWorld {
//
//    public static void main(String[] args) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
//        for (byte b : digest) {
//            System.out.printf("%02x", b);
//        }
//    }
//}

//это однострочный комментарий

/*
это многострочный комментарий
 */

/**
 * это javadoc (комментарий-документация)
 */

//Code convention for the Java programming language - тут принятые требования к оформлению кода
// https://www.oracle.com/java/technologies/javase/codeconventions-contents.html