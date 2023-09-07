package polymorphism_challenge;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        super("GasPoweredCar");
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar runEngine");
    }
}
