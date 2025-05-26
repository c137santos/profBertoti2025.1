package MVC.view;

import java.util.ArrayList;
import java.util.List;

import MVC.model.HostelObserver;

public class HostelView implements HostelObserver, HostelInterface {
    private List<HostelInterface> components = new ArrayList<>();
    private String viewName;

    public HostelView(String viewName) {
        this.viewName = viewName;
    }

    @Override
    public void update(String message) {
        System.out.println(viewName + " recebeu atualização: " + message);
    }

    @Override
    public void display() {
        System.out.println("Exibindo " + viewName);
        for (HostelInterface component : components) {
            component.display();
        }
    }

    @Override
    public void add(HostelInterface component) {
        components.add(component);
    }

    @Override
    public void remove(HostelInterface component) {
        components.remove(component);
    }
}