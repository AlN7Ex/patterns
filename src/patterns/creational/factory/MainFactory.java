package patterns.creational.factory;

import patterns.creational.factory.car.Car;
import patterns.creational.factory.factories.*;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = chooseCarFactory(CarType.SEDAN);
        Car car = carFactory.getCar();
        car.drive();

    }

    public static CarFactory chooseCarFactory(CarType type) {
        return switch (type) {
            case SUV -> new SUVFactory();
            case SEDAN -> new SedanFactory();
            case SUPER -> new SupercarFactory();
            case COUPE -> new CoupeFactory();
        };
    }
}



enum CarType {
    SEDAN,
    SUV,
    SUPER,
    COUPE
}
