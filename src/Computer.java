public class Computer {
    private Drive drive;
    private CPU cpu;
    private RAM ram;

    public Computer(Part drive, Part cpu, Part ram) {
        this.drive = (Drive) drive;
        this.cpu = (CPU) cpu;
        this.ram = (RAM) ram;
    }

    public void overclockCPU(double freq){
        try {
            cpu.isNotSoHot(freq);
            System.out.println("Aktualna temperatura po podkręcaniu: " + cpu.getTemperature() +"*C");
        } catch (OverheatingRiskException ex) {
            System.err.println("Ryzyko przegrzania komponentu. Temperatura komponentu: " + cpu.getTemperature()+"*C");
        }
    }

    public void overclockRAM(double freq){
        try {
            ram.isNotSoHot(freq);
            System.out.println("Aktualna temperatura po podkręcaniu: " + ram.getTemperature() + "*C");
        } catch (OverheatingRiskException ex) {
            System.err.println("Ryzyko przegrzania komponentu. Temperatura komponentu: " + ram.getTemperature() + "*C");
        }
    }


    public void showInfo(){
        System.out.println("Drive: " + drive.toString() + "\n"
        + "CPU: " + cpu.toString() +"\n" + "RAM: " + ram.toString());
    }
}
