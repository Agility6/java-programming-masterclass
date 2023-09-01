package pool_area;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getVolume() {
        double area = getArea();
        return (height * area);
    }

    public double getHeight() {
        return height;
    }
}
