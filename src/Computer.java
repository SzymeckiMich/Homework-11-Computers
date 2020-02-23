public class Computer {
    private Part drive;
    private Part cpu;
    private Part ram;

    public Computer(Part drive, Part cpu, Part ram) {
        this.drive = drive;
        this.cpu = cpu;
        this.ram = ram;
    }
    public void showInfo(){
        System.out.println("Drive: " + drive.toString() + "\n"
        + "CPU: " + cpu.toString() +"\n" + "RAM: " + ram.toString());
    }
}
