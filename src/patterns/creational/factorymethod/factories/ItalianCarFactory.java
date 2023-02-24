package patterns.creational.factorymethod.factories;

import patterns.creational.factory.CarType;
import patterns.creational.factory.car.Car;
import patterns.creational.factorymethod.car.italian.ItalianCoupe;
import patterns.creational.factorymethod.car.italian.ItalianSUV;
import patterns.creational.factorymethod.car.italian.ItalianSedan;
import patterns.creational.factorymethod.car.italian.ItalianSupercar;

public class ItalianCarFactory extends CarFactory {
    @Override
    public Car createCar(CarType carType) {
        return switch (carType) {
            case SEDAN -> new ItalianSedan();
            case COUPE -> new ItalianCoupe();
            case SUPER -> new ItalianSupercar();
            case SUV -> new ItalianSUV();
        };
    }
}
