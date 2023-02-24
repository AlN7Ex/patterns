package patterns.creational.factory;
import patterns.creational.factory.car.*;

public class CarFactory {
    public Car createCar(CarType carType) {
        return switch (carType) {
            case SEDAN -> new Sedan();
            case COUPE -> new Coupe();
            case SUPER -> new Supercar();
            case SUV -> new SUV();
        };
    }
}
