public abstract class Part {
    private String producer;
    private String name;
    private String serialNumber;

    public Part(String producer, String name, String serialNumber) {
        this.producer = producer;
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Producer: " + producer +
                ", name: " + name +
                ", serialNumber: " + serialNumber +
                ", ";
    }
}
