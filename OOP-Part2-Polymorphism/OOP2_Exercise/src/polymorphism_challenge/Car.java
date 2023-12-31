package polymorphism_challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("StartEngine...");
    }

    public void drive() {
        System.out.println("Car -> driving, type is : " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("runEngine...");
    }
}
