package patterns.creational.factorymethod.car.german;

import patterns.creational.factory.car.Car;

public class GermanSUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving german suv");
    }
}
