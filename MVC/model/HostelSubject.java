package MVC.model;

import java.util.ArrayList;
import java.util.List;

public class HostelSubject {
    private List<HostelObserver> observers = new ArrayList<>();

    public void addObserver(HostelObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(HostelObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (HostelObserver observer : observers) {
            observer.update(message);
        }
    }
}
