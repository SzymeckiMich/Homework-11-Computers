public class Test {
    public static void main(String[] args) {

        Overclocked cpu = new CPU("Intel", "i7", "XX22XX",
                1500, 40, 100);
        Overclocked ram = new RAM("FabrykaRamu", "Kość 1gb", "BCVH", 1024,
                1500, 15, 100);

        Drive drive = new Drive("Samsung", "QVO", "123QWER", 512);

        Computer computer = new Computer(drive, cpu, ram);
        computer.showInfo();



    }

}
