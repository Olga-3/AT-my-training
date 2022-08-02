package org.example.helper;

import java.io.IOException;
import java.util.Arrays;

public class Foobar {
/*    Реализовать функцию, которая будет будет принимать на вход целое число и выводить
в консоль "foo", если число кратно 3,
"bar", если число кратно 5 и "foobar",
если число кратно 15. Покрыть тестами.

добавить:
1) если число не кратно ни одному значению (15, 5, 3), мы выводим число в консоль и возвращаем само число

потом (если 1 пункт сработал):
2) попробовать сканировать то, что выводится в консоль (сделать функцию foobar void) - погуглить, есть системный метод

 */

    //автоматически сгенерировать тесты - Alt+Insert - test, выбрать TestNG (тут используем TestNG),
    //поставить галочку напротив функции и нажать ОК

    /*
    ДЗ 2 июня:

    выучить, что такое статический метод, почему для работы с ним не нужно ключевого слова new
    https://docs.google.com/document/d/1E40Py7QcbBOZocVj-C8xWria_cyqkkgYGbAtVwN5FhE/edit?usp=sharing  (первый уровень, Java)

Напишите программу, которая выводит в консоль простые числа в указанном промежутке.
    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

15.06 дз:
Реализуйте функцию, которая для данных трёх целых чисел (a,b,c) возвращает сумму квадратов двух наибольших из них

Вопросы для подготовки: Что такое дефект?
Как оформить дефект?
Какие системы баг-трекинга знаете?
Что такое классы эквивалентности?
Граничные значения?
 */

    public Foobar() {
    }

    public void foobar(int number1) {
        String message = "";
        if (number1 == 0) {
            message = "0";
        } else if ((number1 % 15) == 0) {
            message = "foobar";
        } else if ((number1 % 5) == 0) {
            message = "bar";
        } else if ((number1 % 3) == 0) {
            message = "foo";
        } else {
            message = String.valueOf(number1);// этот метод преобразует любое значение в строковое (универсальнее, чем Integer.toString()  )
        }
        System.out.print(message);
    }

    public int primeNumbers(int start, int finish) { // тут проверка только на нечетность
        int amount = 0;
        for (int i = start; i < finish; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                amount++;
            }
        }
        return amount;
    }


    // простые числа:
    // мы перебираем все числа от заданного числа №1 до заданного числа №2,
    // каждое из этих чисел мы пробуем поделить на число от 1 до (заданное число №2- 1)
    public void primeNumbers2(int start, int finish) { // числа должны делиться только на себя

        for (int i = start; i < finish; i++) {  //тут перебор чисел от и до, которые мы проверяем в функции ниже
            if (isPrime(i)) {  //если число простое, мы выводим его в консоль
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int checked_number) {
        if (checked_number == 2) {
            return true; //true означает простое
        }
        for (int k = 2; k < checked_number; k++) { //перебор чисел, на которые делим
            if (checked_number % k == 0) { //если число делится без остатка на какое-то число от 2
                // до (проверяемого числа -1)
                return false; //значит, это не простое число
            }

        }
        return true; //иначе это простое
    }

    
    
  

    /*
    Последовательность простых чисел начинается так: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137,
    139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, …
     */

    public int biggest2Square(int a, int b, int c) {
        int square1 = 0;
        int square2 = 0;
        if ((a > b) && (a > c)) { // а - наибольшее
            System.out.println("Наибольшее число: " + a);
            square1 = a * a;
            if (b > c) {
                square2 = b * b; // b - второе наибольшее
                System.out.println("Второе наибольшее число: " + b + ", в квадрате: " + square2);
            } else {
                square2 = c * c; // с - второе наибольшее
                System.out.println("Второе наибольшее число: " + c + ", в квадрате: " + square2);
            }
        }
        if ((b > a) && (b > c)) { // b - наибольшее
            System.out.println("Наибольшее число: " + b);
            square1 = b * b;
            if (a > c) {
                square2 = a * a;
                System.out.println("Второе наибольшее число: " + a + ", в квадрате: " + square2);
            } else {
                square2 = c * c;
                System.out.println("Второе наибольшее число: " + c + ", в квадрате: " + square2);
            }
        }
        if ((c > a) && (c > b)) { // c - наибольшее
            System.out.println("Наибольшее число: " + c);
            square1 = c * c;
            if (b > a) {
                square2 = b * b;
                System.out.println("Второе наибольшее число: " + b + ", в квадрате: " + square2);
            } else {
                square2 = a * a;
                System.out.println("Второе наибольшее число: " + a + ", в квадрате: " + square2);
            }
        }
        System.out.println("Сумма квадратов 2-х наибольших чисел: " + square1 + square2);
        return square1 + square2;
    }
    /*
    Даны два массива целых чисел, отсортированных по возрастанию {0, 2, 2} и {1, 3} (содержание массивов неизвестно). Надо объединить их в один, чтобы на
    выходе получился массив, отсортированный так же по возрастанию: {0, 1, 2, 2, 3}.
     */

//    public int[] correctArray() {
//        int[] array1 = {0, 2, 2};
//        int[] array2 = {1, 3};
//
//        int[] arrayResult = new int[array1[].length+array2[].length];
//        for(int x: array1) {                  //сначала итерация по
//            for(int y: arrayResult) {
//                arrayResult[y] = array1[x];
//            }
//        }
//
//        Arrays.sort(arrayResult, 0, 4); //сортируем массив
//
//        return arrayResult[];
//    }

    /*
    Реализуйте функцию, возвращающую двоичное представление числа n (n>=0). Например, 101 - это двоичное представление
 числа. Метод должен иметь сигнатуру String toBinary(int number)
     */

    public String toBinary(int n) throws IOException {
        if (n >= 0) {
            return Integer.toBinaryString(n);
        } else {
            System.err.println("The number is not correct");
            throw new IOException("The number is not correct");
        }
    }

    public void callToBinary() {
        try {
            toBinary(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
   написать свой Exception. Его можно наследовать от Runtime, если необрабатываемое, от IOException, если обрабатываемое
     */
}

