package org.abstract_class;

import lombok.Getter;
import lombok.Setter;

//эти аннотации добавляют getter и setter, и их не надо самостоятельно прописывать
@Getter
@Setter
public class Car {

    private String model;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    static {     // это статический блок инициализации
        System.out.println(Three_dimensional_shapes.shape1);          //  тут какой-то код
    }

}
