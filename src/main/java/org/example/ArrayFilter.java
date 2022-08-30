package org.example;

import java.util.Arrays;

public class ArrayFilter {

    //    public int[] arraySort(int[] array, int number) {
//        //int[] newArray = array;
//
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] == number) {
//                array[i]=array[i+1];
//                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
//            }
//        }
//        return array;
//    }


    public int[] arrayFilter(int[] array, int number) {
        int[] newArr = new int[array.length - countingElements(array, number)];
        System.out.println("Original Array is: " + Arrays.toString(array));

        int count = 0;
        for (int check : array) {
            if (check != number) {
                newArr[count] = check;
                count++;
            }
        }
        System.out.println("New Array after deleting element = " + number + " and shifting: " + Arrays.toString(newArr));
        return newArr;
    }

    public int countingElements(int[] array1, int number) {
        int count = 0;
        for (int check :
                array1) {
            if (check == number) {
                count++;
            }
        }
        return count;
    }

    //сделать ограничение: функция должна принимать число от  -999 до 999. Иначе должен выводиться exception,
    // сделать тесты, создать exception
}
