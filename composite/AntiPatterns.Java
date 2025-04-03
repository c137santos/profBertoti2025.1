class Hostel {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void makeBeds() {
        System.out.println("🚪 Arrumando todas as camas do hostel");
        for (Room room : rooms) {
            room.makeBeds();  // Precisa chamar diretamente Room
        }
    }
}

class Room {
    private List<Bed> beds = new ArrayList<>();
    private int numero;

    public Room(int numero) {
        this.numero = numero;
    }

    public void addBed(Bed bed) {
        beds.add(bed);
    }

    public void makeBeds() {
        System.out.println("🚪 Arrumando o quarto " + numero);
        for (Bed bed : beds) {
            bed.makeBed(); 
        }
    }
}

class Bed {
    private int numero;

    public Bed(int numero) {
        this.numero = numero;
    }

    public void makeBed() {
        System.out.println("🛏️ Arrumando a cama " + numero);
    }
}

public class HostelManagement {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        
        Room room1 = new Room(101);
        room1.addBed(new Bed(1));
        room1.addBed(new Bed(2));

        Room room2 = new Room(102);
        room2.addBed(new Bed(3));

        hostel.addRoom(room1);
        hostel.addRoom(room2);

        hostel.makeBeds();
    }
}
