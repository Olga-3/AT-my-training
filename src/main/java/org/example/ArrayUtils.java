package org.example;

import java.util.Arrays;

public class ArrayUtils {
     /*
    Даны два массива целых чисел, отсортированных по возрастанию {0, 2, 2} и {1, 3} (содержание массивов неизвестно). Надо объединить их в один, чтобы на
    выходе получился массив, отсортированный так же по возрастанию: {0, 1, 2, 2, 3}.
     */

    public int[] arraysMergeAndSort(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int j = 0;

        for (; j < arr1.length; j++) {
            result[j] = arr1[j];
        }
        for(int i = 0; i < arr2.length; i ++) {
            result[j + i] = arr2[i];
        }
        return result;
    }

    //а это мой неоптимальный вариант, тоже работает:
    public int[] arraysMergeAndSort2(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int pause = 0;

        for (int j = 0; j < arr1.length; j++) {
            result[j] = arr1[j];
            pause = j;
        }
        for(int i = 0; i < arr2.length; i ++) {
            result[pause + i + 1] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.println(Arrays.toString(arrayUtils.arraysMergeAndSort(new int[]{0, 2, 2, 7}, new int[]{1, 3, 5, 7})));
    }
}
