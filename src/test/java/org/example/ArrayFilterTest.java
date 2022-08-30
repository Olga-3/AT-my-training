package org.example;

import org.abstract_class.Square;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFilterTest {

    @DataProvider
    public static Object[][] dPCountingElements() {
        return new Object[][]{
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 6, 2},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 1}, 1, 3},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 1}, 4, 1},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 1}, 0, 0},
                {new int[]{}, 6, 0},
        };

    }

    @DataProvider
    public static Object[][] dPArrayFilter() {
        return new Object[][]{
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 6, new int[]{1, 1, 3, 4, 5, 7}},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 1, new int[]{3, 4, 5, 6, 7, 6}},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 0, new int[]{1, 1, 3, 4, 5, 6, 7, 6}},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, -12, new int[]{1, 1, 3, 4, 5, 6, 7, 6}},
                {new int[]{1, 1, 3, 4, 5, 6, 7, 6}, 2147483647, new int[]{1, 1, 3, 4, 5, 6, 7, 6}},
                {new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 1, new int[]{}},
        };
    }

    @Test(dataProvider = "dPArrayFilter")
    public void testArrayFilter(int[] array1, int number, int[] array2) {
        ArrayFilter arrayFilter = new ArrayFilter();
        assertEquals(arrayFilter.arrayFilter(array1, number), array2, "oops!");
    }

    @Test(dataProvider = "dPCountingElements")
    public void testCountingElements(int[] array1, int number, int quantity) {
        ArrayFilter arrayFilter = new ArrayFilter();
        assertEquals(arrayFilter.countingElements(array1, number), quantity, "...");
    }


}