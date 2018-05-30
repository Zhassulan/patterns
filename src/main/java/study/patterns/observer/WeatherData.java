package study.patterns.observer;

import java.util.Observable;

public class WeatherData extends Observable {

    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData() {  }

    public void measurementChanged()    {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)  {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
