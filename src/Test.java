public class Test {
    public static void main(String[] args) {

        CPU cpu = new CPU("Intel", "i7", "XX22XX",
                1500, 40, 100);
        RAM ram = new RAM("HyperX", "Fury DDR3", "BCVH", 8192,
                1600, 40, 100);
        Drive drive = new Drive("Samsung", "QVO", "123QWER", 512);

        Computer computer = new Computer(drive, cpu, ram);
        computer.showInfo();
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);
        computer.overclockRAM(100);

    }
}