import java.util.ArrayList;
import java.util.List;

import java.util.Random;


public class WeatherStation implements Runnable {
    private final String name;
    private final int minimumTemperature;
    private final int maximumTemperature;
    private int currentTemperature;

    private List<WeatherObserver> observers = new ArrayList<>();
    private Random random = new Random();


    public WeatherStation(String name, int minimumTemperature, int maximumTemperature) {
        this.name = name;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
        this.currentTemperature = random.nextInt(minimumTemperature, maximumTemperature);
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }


    public void updateTemperature() {
        int newTemperature = currentTemperature + random.nextInt(-1, 1);

        if (newTemperature < minimumTemperature) {
            newTemperature = minimumTemperature;
        } else if (newTemperature > maximumTemperature) {
            newTemperature = maximumTemperature;
        }
        this.currentTemperature = newTemperature;

    }

    @Override
    public void run() {
        while (true) {
            updateTemperature();
            notifyObservers();
            try {
                Thread.sleep(random.nextInt(0,5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.currentTemperature);
        }
    }
}
