public abstract class Overclocked extends Part {
    private double frequency;
    private double temperature;
    private final double NORMAL_TEMPERATURE;
    private final double MAX_SAFE_TEMPERATURE;


    public Overclocked(String producer, String name, String serialNumber, int frequency, double normalTemperature, double maxSafeTemperature) {
        super(producer, name, serialNumber);
        this.frequency = frequency;
        this.NORMAL_TEMPERATURE = normalTemperature;
        this.MAX_SAFE_TEMPERATURE = maxSafeTemperature;
        temperature = NORMAL_TEMPERATURE;

    }

    public double getFrequency() {
        return frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getNORMAL_TEMPERATURE() {
        return NORMAL_TEMPERATURE;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getMAX_SAFE_TEMPERATURE() {
        return MAX_SAFE_TEMPERATURE;
    }

    public abstract void isNotSoHot(double freq);


}
