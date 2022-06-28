package org.abstract_class;

public abstract class Shape { //это абстрактный класс, от которого наследуются классы Square, Triangle, Circle, Rhombus
    protected double height;
    abstract double getPerimeter(); //это метод получения периметра, к-ый будет переписан в классах-наследниках
    abstract double getSquare(); //это метод получения площади, к-ый будет переписан в классах-наследниках
}
