public class WeatherObserver implements Observer {

    private int temperature;
    private String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println(this.name + " Temperature updated to: " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
