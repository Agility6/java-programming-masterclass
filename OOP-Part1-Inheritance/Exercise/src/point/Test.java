package point;

/**
 * ClassName: Test
 * Description:
 *
 * @Author Agility6
 * @Create 2023-08-25
 * @Version 1.0
 */
public class Test {
  public static void main(String[] args) {
    Point first = new Point(6, 5);
    Point second = new Point(3, 1);

    System.out.println("distance(0,0)= " + first.distance());
    System.out.println("distance(second)= " + first.distance(second));
    System.out.println("distance(2,2)= " + first.distance(2, 2));

    Point point = new Point();
    System.out.println("distance()= " + point.distance());
  }
}
