public class Drive extends Part {
    private int memory;

    public Drive(String producer, String name, String serialNumber, int memory) {
        super(producer, name, serialNumber);
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + "memory: " + memory + "GB";
    }
}
