package org.abstract_class;

public class Cube extends Shape implements Three_dimensional_shapes {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

//    public void setSide(double side) {
//        this.side = side;
//    }

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
        return side*side*side;
    }
}
