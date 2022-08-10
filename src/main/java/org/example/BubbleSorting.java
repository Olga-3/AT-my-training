package org.example;

import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        System.out.println("Before: ");
        printArray(numbers);

        //Sorting algorithm
            //это из видео https://www.youtube.com/watch?v=g8qeaEd2jTc
        boolean swappedSomething = true;
        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter: ");
        printArray(numbers);

        // а это ниже мои неудачные попытки:
//        boolean changed = true; // if numbers had to be changed
//        int num;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > numbers[i + 1]) {
//                num = numbers[i];
//                numbers[i] = numbers[i + 1];
//                numbers[i + 1] = num;
//            } else {
//                changed = false;
//                break;
//            }


//            for (int j = i + 1; j < (numbers.length) && numbers[i] > numbers[j] && changed; j++) {
//                if (numbers[i] <= numbers[j]) {
//                    changed = false;
//                    break;
//                } else {
//                    int num = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = num;
//                    changed = true;
//                }
//            }
        //      }

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
