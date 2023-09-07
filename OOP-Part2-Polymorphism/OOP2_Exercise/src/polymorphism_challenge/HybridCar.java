package polymorphism_challenge;

public class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        super("HybridCar");
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("HybridCar startEngine...");
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar runEngine");
    }
}
