package allAboutStrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";

        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/","25","11","1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");

        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/")
                .concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replaceFirst("/", "--")); // replaceAll使用正则表达式

        // jdk11 --> repeat() jdk15 --> indent()
        System.out.println("ABD\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.print("ABC\n".repeat(3).indent(8)); // indent缩进8个空格
        System.out.println("-".repeat(20));
    }
}
