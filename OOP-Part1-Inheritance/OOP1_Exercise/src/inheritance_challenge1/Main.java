package inheritance_challenge1;

public class Main {
    public static void main(String[] args) {
        Employee ag = new Employee("Agility6", "2000-10-13", "2024-8-27");
        System.out.println(ag);
        System.out.println("ag age = " + ag.getAge());
        System.out.println("ag pay = " + ag.collectPay());

        Employee tim = new Employee("Tim", "2001-10-13", "2024-9-10");
        System.out.println(tim);

        SalariedEmployee joe = new SalariedEmployee("Joe", "2000-10-13",
                "2023-12-23",300000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $ " + joe.collectPay());

        joe.retire(); // 退休
        System.out.println("Joe's Pension check = $ " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "2001-10-21",
                "2021-02-01", 18);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $ " + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $ " + mary.getDoublePay());
    }
}
