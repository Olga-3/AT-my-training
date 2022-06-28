package org.abstract_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter

public class Square extends Shape {
    private double side;

    //   public double getSide() {
//        while(true){  // бесконечный цикл
/*        if (true) {         //тут можно написать какое-то условие для выхода из рекурсии
            return 0.0;
        }
*/
//        }
//        for (;;) {   // бесконечный цикл
//
//        }
  //      getSide();              // рекурсия

/*        return side;
    }*/

    @Override
    public double getPerimeter() {
        return side * 4;

    }

    @Override
    double getSquare() {
        return side * side;
    }

    public Square setSide(double side) {
        this.side = side;
        return this;
    }
    //сделать тесты на эти два метода
    //создать экземпляр Square, передать туда параметр и ожидаемое значение в Assert

}
