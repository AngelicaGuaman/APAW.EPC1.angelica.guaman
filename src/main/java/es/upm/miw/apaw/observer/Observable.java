package es.upm.miw.apaw.observer;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    private final Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
