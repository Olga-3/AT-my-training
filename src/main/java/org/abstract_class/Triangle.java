package org.abstract_class;

public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;

   //конструкторы - чтобы их добавить, нажать Alt + insert   или меню сверху Code-> Generate

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    double getSquare() {
        return 0;
    }
}
