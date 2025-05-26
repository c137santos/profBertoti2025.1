package MVC.model;

import java.util.ArrayList;
import java.util.List;

public class Room extends HostelSubject {
    private int identifier;
    private List<Bed> beds = new ArrayList<>();

    public Room(int identifier) {
        this.identifier = identifier;
    }

    public void addBed(Bed bed) {
        beds.add(bed);
        notifyObservers("Nova cama adicionada ao quarto " + identifier);
    }

    public void clean() {
        notifyObservers("Limpando quarto " + identifier);
        for (Bed bed : beds) {
            bed.make();
        }
    }

    public int getIdentifier() {
        return identifier;
    }

    public List<Bed> getBeds() {
        return new ArrayList<>(beds);
    }
}