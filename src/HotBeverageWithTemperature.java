public class HotBeverageWithTemperature extends HotBeverage {
    private int temperature;

    public HotBeverageWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + temperature + "°C";
    }
}
