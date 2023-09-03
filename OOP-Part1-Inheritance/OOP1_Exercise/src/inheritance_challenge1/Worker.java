package inheritance_challenge1;

public class Worker {
    
    private String name;
    private String birthDate; // 2020-10-13
    protected String endDate;

    public Worker() {}

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int birthYear = Integer.parseInt(birthDate.substring(0, 4));
        return (2023 - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void termiante(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
