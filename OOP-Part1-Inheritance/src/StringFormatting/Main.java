package stringFormatting;

public class Main {
    public static void main(String[] args) {

        // jdk15 before
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        System.out.println("- - - - -");

        // jdk15 after
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 23;
        System.out.printf("Your age is %d", age);

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age+=1);
        System.out.println("up" + formattedString);
    }
}
