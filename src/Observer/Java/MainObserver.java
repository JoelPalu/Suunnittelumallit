public class MainObserver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("YepCock",-10, 40);
        WeatherObserver weatherObserver = new WeatherObserver("Observer1");
        Thread thread = new Thread(weatherStation);
        thread.start();
        weatherStation.addObserver(weatherObserver);
        WeatherObserver weatherObserver2 = new WeatherObserver("Observer2");
        weatherStation.addObserver(weatherObserver2);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherStation.removeObserver(weatherObserver);

    }
}
