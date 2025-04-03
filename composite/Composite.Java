import java.util.ArrayList;
import java.util.List;

interface Accommodations {
    void makeBed();
}

class Hostel implements Accommodations {
    private String name;
    private List<Accommodations> beds = new ArrayList<>();
    private List<Accommodations> rooms = new ArrayList<>();

    public Hostel(String name) {
        this.name = name;
    }

    public void addBeds(Accommodations accommodation) {
        beds.add(accommodation);
    }
    public void addRooms(Accommodations accommodation) {
        rooms.add(accommodation);
    }

    @Override
    public void makeAllBeds() {
        System.out.println("🏨 Arrumando todas as camas no hostel " + name);
        for (Accommodations room : rooms) {
            room.makeBed(); 
        }
    }
}

class Room implements Accommodations {
    private int identifier;
    private List<Accommodations> accommodations = new ArrayList<>();

    public Room(int identifier) {
        this.identifier = identifier;
    }

    public void add(Accommodations accommodation) {
        accommodations.add(accommodation);
    }

    @Override
    public void makeBed() {
        System.out.println("🚪 Arrumando o quarto " + identifier);
        for (Accommodations accommodation : accommodations) {
            accommodation.makeBed(); 
        }
    }
}

class Bed implements Accommodations {
    private int number;

    public Bed(int number) {
        this.number = number;
    }

    @Override
    public void makeBed() {
        System.out.println("🛏️ Arrumando a cama " + number);
    }
}

public class HostelManagement {
    public static void main(String[] args) {
        Bed bed1 = new Bed(1);
        Bed bed2 = new Bed(2);
        Bed bed3 = new Bed(3);

        Room room1 = new Room(101);
        room1.add(bed1);
        room1.add(bed2);

        Room room2 = new Room(102);
        room2.add(bed3);

        Hostel hostel = new Hostel("Backpacker Paradise");
        hostel.add(room1);
        hostel.add(room2);

        hostel.makeBed();  // Agora chama makeBed() de forma genérica para tudo!
    }
}
