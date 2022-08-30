package org.example;

import java.util.Arrays;

public class ArraySort {

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
    public void arraySort(int[] array, int number) {
        int[] newArr = null;
        System.out.println("Original Array is: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                newArr = new int[array.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = array[index];
                }
                for (int j = i; j < array.length - 1; j++) {
                    newArr[j] = array[j + 1];
                }
                break;
            }
        }
        System.out.println("New Array after deleting element = " + number + " and shifting: " + Arrays.toString(newArr));
    }


    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        //System.out.println(Arrays.toString(arraySort.arraySort(new int[]{1,1,3,4,5,6,7,6}, 6)));
        arraySort.arraySort(new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 6);
    }
}
