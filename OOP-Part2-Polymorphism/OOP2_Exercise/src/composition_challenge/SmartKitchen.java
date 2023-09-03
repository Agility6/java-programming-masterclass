package composition_challenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    // addWater() will set the Coffee Maker's hasWorkToDo field to true
    public void addWater(boolean hasWorkToDo) {
        brewMaster.setHasWorkToDo(hasWorkToDo);
        System.out.println("Coffee Maker's working");
    }

    // pourMilk() will set Refrigerator's hasWorkToDo to true.
    public void pourMilk(boolean hasWorkToDo) {
        iceBox.setHasWorkToDo(hasWorkToDo);
        System.out.println("iceBox Refrigerator's working");
    }

    // loadDishwasher() will set the hasWorkToDo flag to true, on that appliance.
    public void loadDishwasher(boolean hasWorkToDo) {
        dishWasher.setHasWorkToDo(hasWorkToDo);
        System.out.println("loadDishwasher's working");
    }

    public void setKitchenState(boolean brewMasterFlag, boolean dishWasherFlag,
                                boolean iceBoxFlag) {
        this.brewMaster.setHasWorkToDo(brewMasterFlag);
        this.dishWasher.setHasWorkToDo(dishWasherFlag);
        this.iceBox.setHasWorkToDo(iceBoxFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.DoDishes();
        iceBox.orderFood();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
