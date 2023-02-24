package patterns.creational.factory.factories;

import patterns.creational.factory.car.Car;
import patterns.creational.factory.car.SUV;

public class SUVFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new SUV();
    }
}
