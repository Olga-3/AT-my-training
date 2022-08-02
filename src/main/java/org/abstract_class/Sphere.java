package org.abstract_class;

public class Sphere extends Shape implements Three_dimensional_shapes{
    public Sphere(double radius) {
        this.radius = radius;
    }

    private double radius;



    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    double getSquare() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 3.14 * radius*radius*radius * 4 / 3;
    }
}
