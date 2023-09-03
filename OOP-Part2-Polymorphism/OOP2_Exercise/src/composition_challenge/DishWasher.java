package composition_challenge;

public class DishWasher extends Product {

    public DishWasher() {

    }

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void DoDishes() {
        if (isHasWorkToDo()) {
            System.out.println("DoDishes Working!");
        } else {
            System.out.println("Not Work!");
        }
    }
}
