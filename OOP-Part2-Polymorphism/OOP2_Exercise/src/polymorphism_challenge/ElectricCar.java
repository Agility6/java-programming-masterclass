package polymorphism_challenge;

public class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int battery;

    public ElectricCar(double avgKmPerCharge, int battery) {
        super("ElectricCar");
        this.avgKmPerCharge = avgKmPerCharge;
        this.battery = battery;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("ElectricCar startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.println("ElectricCar runEngine");
    }
}
