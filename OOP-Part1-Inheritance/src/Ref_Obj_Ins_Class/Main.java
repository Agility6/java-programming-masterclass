package ref_obj_ins_class;

public class Main {
  public static void main(String[] args) {
   
    House blueHouse = new House("blue");
    House anotherHouse = blueHouse;

    System.out.println(blueHouse.getColor()); // blue
    System.out.println(anotherHouse.getColor()); // blue

    anotherHouse.setColor("red");
    System.out.println(blueHouse.getColor()); // red
    System.out.println(anotherHouse.getColor()); // red

    House greenHouse = new House("green");
    anotherHouse = greenHouse;
   
    System.out.println(blueHouse.getColor()); // red
    System.out.println(greenHouse.getColor()); // green
    System.out.println(anotherHouse.getColor()); // green

  } 
}
