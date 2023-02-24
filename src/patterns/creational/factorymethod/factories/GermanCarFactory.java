package patterns.creational.factorymethod.factories;

import patterns.creational.factory.CarType;
import patterns.creational.factory.car.Car;
import patterns.creational.factorymethod.car.german.GermanCoupe;
import patterns.creational.factorymethod.car.german.GermanSUV;
import patterns.creational.factorymethod.car.german.GermanSedan;
import patterns.creational.factorymethod.car.german.GermanSupercar;

public class GermanCarFactory extends CarFactory {
    @Override
    public Car createCar(CarType carType) {
        return switch (carType) {
            case SEDAN -> new GermanSedan();
            case COUPE -> new GermanCoupe();
            case SUPER -> new GermanSupercar();
            case SUV -> new GermanSUV();
        };
    }
}
