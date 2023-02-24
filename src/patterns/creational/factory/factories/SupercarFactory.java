package patterns.creational.factory.factories;

import patterns.creational.factory.car.Car;
import patterns.creational.factory.car.Supercar;

public class SupercarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Supercar();
    }
}
