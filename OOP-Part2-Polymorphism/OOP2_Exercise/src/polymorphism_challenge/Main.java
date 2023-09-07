package polymorphism_challenge;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car gpc = new GasPoweredCar(244.1, 4);
        Run(gpc);


        Car ec = new ElectricCar(244.1, 4);
        Run(ec);

        Car hc = new HybridCar(244.1, 32, 4);
        Run(hc);
    }

    public static void Run(Car car) {

        car.startEngine();
        car.drive();
    }
}
