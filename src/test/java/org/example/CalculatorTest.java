package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetResultPlus() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.getResult(10, "+", 2));
    }

    @Test
    public void testGetResultMinus() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.getResult(6, "-", 0));
    }

    @Test
    public void testGetResultMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.getResult(3, "*", 4));
    }

    @Test
    public void testGetResultDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.getResult(9, "/", 3));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testGetResultNegativeDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.getResult(45, "/", 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testGetResultIncorrectOperation() {
        new Calculator().getResult(9, "gdgf", 3);
    }

    //написать свой Exception
    //сделать метод, который будет работать с фигурами - создать абстрактный класс Shape,
    //от него унаследовать классы Круг, Квадрат, треугольник, ромб
    // у класса Shape должны быть абстрактные методы getPerimeter, getSquare
    // у абстрактных методов нет блока кода
    // у классов есть код для этих методов
    // есть конструкторы классов со своими параметрами (напр., для круга один параметр -радиус)


}