package cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume() {
        double area = getArea();
        return (area * height);
    }

    public double getHeight() {
        return height;
    }
}
