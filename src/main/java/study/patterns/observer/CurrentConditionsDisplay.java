package study.patterns.observer;

import study.patterns.observer.interfaces.IDisplayElement;
import study.patterns.observer.interfaces.IObserver;
import study.patterns.observer.interfaces.ISubject;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
