package patterns.creational.factory.factories;

import patterns.creational.factory.car.Car;
import patterns.creational.factory.car.Coupe;

public class CoupeFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Coupe();
    }
}
