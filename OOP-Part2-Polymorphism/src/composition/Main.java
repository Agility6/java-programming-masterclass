package composition;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 * 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        // create personalComputer
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputercase().pressPowerButton();

        // main program does not need to know anything about the PC components.
        thePC.powerUp();
    }
}
