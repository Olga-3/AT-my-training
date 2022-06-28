package org.abstract_class;

public class Circle extends Shape{
    public double radius;

//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //переделываю методы абстрактного класса
    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    double getSquare() {
        return 3.14*radius*radius;
    }
}
