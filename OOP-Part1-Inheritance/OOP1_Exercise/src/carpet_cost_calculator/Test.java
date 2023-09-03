package carpet_cost_calculator;

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
    Carpet carpet = new Carpet(3.5);   
    Floor floor = new Floor(2.75, 4.0);
    Calculator calculator = new Calculator(floor, carpet);
    System.out.println("total= " + calculator.getTotalCost());
    carpet = new Carpet(1.5);
    floor = new Floor(5.4, 4.5);
    calculator = new Calculator(floor, carpet);
    System.out.println("total= " + calculator.getTotalCost());
  }
}
