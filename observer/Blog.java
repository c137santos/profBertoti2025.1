package observer;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<String> posts = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addPost(String post) {
        posts.add(post);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getPosts() {
        return posts;
    }
}