package ObserverPattern.Observable;

import ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements Observable {
    List<Observer> observers = new ArrayList<>();
    float temp;
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObserver();
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }


}
