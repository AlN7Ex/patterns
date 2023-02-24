package patterns.creational.factory;

import patterns.creational.factory.car.Car;

public class FactoryMain {
    public static void main(String[] args) {
        Car car = new CarFactory().createCar(CarType.SEDAN);
        car.drive();
    }
}
