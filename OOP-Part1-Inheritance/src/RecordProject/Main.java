package recordProject;

/**
 * ClassName: Main
 * Description:
 *
 * @Author Agility6
 * @Create 2023-08-22
 * @Version 1.0
 */
public class Main {
  public static void main(String[] args) {

    // for (int i = 1; i <= 5; i++) {
    //   Student s = new Student("S92300" + i,
    //           switch (i) {
    //             case 1 -> "Mary";
    //             case 2 -> "Carol";
    //             case 3 -> "Tim";
    //             case 4 -> "Harry";
    //             case 5 -> "Lisa";
    //             default -> "Anonymous";
    //           },
    //           "05/11/1985",
    //           "Java Class");
    //   System.out.println(s);
    // }

    // System.out.println("- - - - -");

    // for (int i = 1; i <= 5; i++) {
    //   LPAStudent s = new LPAStudent("S92300" + i,
    //           switch (i) {
    //             case 1 -> "Mary";
    //             case 2 -> "Carol";
    //             case 3 -> "Tim";
    //             case 4 -> "Harry";
    //             case 5 -> "Lisa";
    //             default -> "Anonymous";
    //           },
    //           "05/11/1985",
    //           "Java Class");
    //   System.out.println(s);
    // }

    Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java");
    LPAStudent recordStudent = new LPAStudent("S923007", "Tim", "05/11/1985", "Java");

    System.out.println(pojoStudent);
    System.out.println(recordStudent);
     
    System.out.println(recordStudent.name()); // different
    System.out.println(pojoStudent.getName());

    pojoStudent.setClassList("Golang!");
    // recordStudent.setClassList("Golang!"); immutable
  }
}
