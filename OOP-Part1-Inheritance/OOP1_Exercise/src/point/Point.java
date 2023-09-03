package point;

/**
 * ClassName: Point
 * Description:
 *
 * @Author Agility6
 * @Create 2023-08-24
 * @Version 1.0
 */
public class Point {
  private int x;
  private int y;

  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance() {
    return distance(0, 0);
  }

  public double distance(int x, int y) {
    int differenceX = this.x - x;
    int differenceY = this.y - y;

    int squareX = differenceX * differenceX;
    int squareY = differenceY * differenceY;

    return Math.sqrt(squareX + squareY);
  }

  public double distance(Point second) {
    int differenceX = this.x - second.getX();
    int differenceY = this.y - second.getY();

    int squareX = differenceX * differenceX;
    int squareY = differenceY * differenceY;

    return Math.sqrt(squareX + squareY);
  }
}
