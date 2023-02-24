package patterns.creational.factory.factories;

import patterns.creational.factory.car.Car;
import patterns.creational.factory.car.Sedan;

public class SedanFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Sedan();
    }
}
