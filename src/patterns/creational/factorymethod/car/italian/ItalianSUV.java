package patterns.creational.factorymethod.car.italian;

import patterns.creational.factory.car.Car;

public class ItalianSUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving italian SUV");
    }
}
