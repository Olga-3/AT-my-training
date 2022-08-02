package org.example.helper;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static org.testng.Assert.*;

public class FoobarTest {
    private ByteArrayOutputStream baos;
    private PrintStream printStream;

    @BeforeTest
    public void prepare() {
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos, true);
        System.setOut(printStream);
    }

    @AfterMethod
    public void afterBufferTest() {
        baos.reset();
    }

    @Test(dataProvider = "dataProviderFoobar")
    public void testFoobar(int number, String result) {
        new Foobar().foobar(number);
        assertEquals(baos.toString(), result, "error"); // тест вывода в консоль
    }

    @DataProvider
    public Object[][] dataProviderFoobar() {
        return new Object[][]{
                {15, "foobar"},
                {5, "bar"},
                {3, "foo"},
                {10, "bar"},
                {9, "foo"},
                {0, "0"},
                {2, "2"},

        };
    }




    @Test(dataProvider = "dataProviderNumber")
    public void testPrimeNumbers(int number1, int number2, int amount) {
        Assert.assertEquals(new Foobar().primeNumbers(number1, number2), amount, "error!");
    }

    @DataProvider
    public Object[][] dataProviderNumber() {
        return new Object[][]{
                {2, 14, 6},
                {0, 14, 7},
                {-1, 14, 8},

//                {5, "bar"},
//                {3, "foo"},
//                {10, "bar"},
//                {9, "foo"},
//                {0, "0"},
//                {2, "2"},

        };
    }

    @Test(dataProvider = "dataProviderPrimeNumbers")
    public void testPrimeNumbers2(int start, int finish) {
        new Foobar().primeNumbers2(start, finish);

    }

    @DataProvider
    public Object[][] dataProviderPrimeNumbers() {
        return new Object[][]{
                {2, 29},     //2, 3, 5, 7, 11, 13, 17, 19, 23, 29

        };
    }

    @Test(dataProvider = "dataProviderBiggest2Square")
    public void testBiggest2Square(int a, int b, int c, int result) {
        Assert.assertEquals(new Foobar().biggest2Square(a, b, c), result, "oops");
    }

    @DataProvider
    public Object[][] dataProviderBiggest2Square() {
        return new Object[][]{
                {2, 4, 1, 20},
                {1, 3, 7, 58},
                {5, 0, 2, 29},
        };
    }


    @Test(expectedExceptions = IOException.class)
    public void test1ToBinary() throws IOException {
        new Foobar().toBinary(-1);
    }

    @Test
    public void test2ToBinary() throws IOException {
        Assert.assertThrows(IOException.class, ()->new Foobar().toBinary(-1));
    }
}