package composition_challenge;

public class Refrigerator extends Product {

    public Refrigerator() {

    }

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("orderFood Working!");
        } else {
            System.out.println("Not Work");
        }
    }

}
