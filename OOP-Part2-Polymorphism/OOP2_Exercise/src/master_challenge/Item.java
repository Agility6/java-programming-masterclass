package master_challenge;

public class Item {

    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }

    /**
     * type: side or drink --> size + " " + name
     * @return
     */
    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    /**
     * size: "SMALL" - 0.5
     * size: "LARGE" + 1
     * @return
     */
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}
