package super_this;

public class Demo {
    public static void main(String[] args) {
        childClass cc = new childClass();
        cc.printHello();
    }
}

class superClass {
    public void printHello() {
        System.out.println("super Hello");
    }
}

class childClass extends superClass {
    @Override
    public void printHello() {
        super.printHello();
        System.out.println("child Hello");
    }
}
