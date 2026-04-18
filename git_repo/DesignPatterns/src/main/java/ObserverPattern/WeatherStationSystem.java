package ObserverPattern;

import ObserverPattern.Observable.Observable;
import ObserverPattern.Observable.WeatherForecast;
import ObserverPattern.Observer.LEDDisplay;
import ObserverPattern.Observer.MobileApp;
import ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Weather forecast System");
        WeatherForecast weatherForecast = new WeatherForecast();
        MobileApp mobileApp = new MobileApp("user1");
        LEDDisplay ledDisplay = new LEDDisplay("user2");
        List<Observer> observers = new ArrayList<>();
        weatherForecast.add(mobileApp);
        weatherForecast.add(ledDisplay);
        weatherForecast.setTemp(20);
        weatherForecast.setTemp(20);

        }

    }
