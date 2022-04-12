package src.headfirst.designpatterns.observer.weather;

import java.util.*;

public class WeatherData {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o); // like push in javascript
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void measurementChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure)
        statisticsDisplay.update(temp, humidity, pressure  )
        forecastDisplay.update(temp, humidity, pressure)
    }
}
