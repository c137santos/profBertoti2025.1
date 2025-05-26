package MVC.model;

import java.util.ArrayList;
import java.util.List;

public class HostelModel extends HostelSubject {
    private String name;
    private List<Room> rooms = new ArrayList<>();

    public HostelModel(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        notifyObservers("Novo quarto adicionado: " + room.getIdentifier());
    }

    public void performCleaning() {
        notifyObservers("Iniciando limpeza no hostel " + name);
        for (Room room : rooms) {
            room.clean();
        }
    }

    // Getters e outros métodos
    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }
}