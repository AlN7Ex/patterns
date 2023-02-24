package patterns.creational.factorymethod;

import patterns.creational.factory.CarType;
import patterns.creational.factory.car.Car;
import patterns.creational.factorymethod.factories.CarFactory;
import patterns.creational.factorymethod.factories.GermanCarFactory;
import patterns.creational.factorymethod.factories.ItalianCarFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        CarFactory germanCarFactory = new GermanCarFactory();
        Car germanCar = germanCarFactory.createCar(CarType.SEDAN);
        germanCar.drive();

        CarFactory italianCarFactory = new ItalianCarFactory();
        Car italianCar = italianCarFactory.createCar(CarType.SUV);
        italianCar.drive();
    }
}
