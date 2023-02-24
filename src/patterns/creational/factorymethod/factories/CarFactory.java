package patterns.creational.factorymethod.factories;

import patterns.creational.factory.CarType;
import patterns.creational.factory.car.Car;

public abstract class CarFactory {
    public abstract Car createCar(CarType carType);
}
