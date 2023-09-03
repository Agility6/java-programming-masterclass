package composition_challenge;

public class CoffeeMaker extends Product {

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("brewCoffee Working!");
        } else {
            System.out.println("Not Work");
        }
    }
}
