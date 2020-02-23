public class RAM extends Overclocked {
    private int memory;
    private final int INCREASE_TEMP = 15;


    public RAM(String producer, String name, String serialNumber, int memory, int frequency,
               double normalTemperature, double maxSafeTemperature) {
        super(producer, name, serialNumber, frequency, normalTemperature, maxSafeTemperature);
        this.memory = memory;
    }

    public void isNotSoHot(double frequency) throws OverheatingRiskException {
        double increaseTemp = (frequency / 100) * INCREASE_TEMP;
        if (super.getTemperature() + increaseTemp > super.getMAX_SAFE_TEMPERATURE()) {
            throw new OverheatingRiskException();
        }
        super.setTemperature(super.getTemperature() + increaseTemp);
        super.setFrequency(super.getFrequency() + frequency);
    }

    @Override
    public String toString() {
        return super.toString() + "Frequency: " + super.getFrequency() + "MHz" + ", Normal temperature: " +
                super.getNORMAL_TEMPERATURE() + "*C, " + "Actual temperature: " + super.getTemperature() + "*C, "
                + " Max safe temperature: " + super.getMAX_SAFE_TEMPERATURE() + "*C, " +
                "Memory: " + memory + "MB";
    }
}
