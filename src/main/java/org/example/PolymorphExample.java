package org.example;

import org.abstract_class.Cube;
import org.abstract_class.Sphere;
import org.abstract_class.Three_dimensional_shapes;

public class PolymorphExample {
    private static void printVolume(Three_dimensional_shapes example) {
        System.out.println(example.getVolume());
    }
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);

        printVolume(cube);
        printVolume(sphere);
    }
}
