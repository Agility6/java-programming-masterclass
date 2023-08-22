/**
 * ClassName: ${NAME}
 * Description:
 *
 * @Author Agility6
 * @Create 2023-08-21 ${TiME}
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Learn OOP Part1");
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        car.describeCar();
    }
}