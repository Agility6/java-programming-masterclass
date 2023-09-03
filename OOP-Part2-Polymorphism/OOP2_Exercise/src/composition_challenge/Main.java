package composition_challenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getDishWasher().DoDishes();
        kitchen.loadDishwasher(true);
        kitchen.getDishWasher().DoDishes();

        SmartKitchen kitchen1 = new SmartKitchen();
        kitchen1.setKitchenState(true, true, true);
        kitchen1.doKitchenWork();
    }
}
