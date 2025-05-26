package MVC.controller;

import MVC.model.Bed;
import MVC.model.HostelModel;
import MVC.model.Room;

public class HostelController implements CleaningStrategy {
    private HostelModel hostelModel;

    public HostelController(HostelModel hostelModel) {
        this.hostelModel = hostelModel;
    }

    @Override
    public void executeCleaning() {
        System.out.println("Executando estratégia de limpeza padrão");
        hostelModel.performCleaning();
    }

    public void addRoom(int roomNumber) {
        Room newRoom = new Room(roomNumber);
        hostelModel.addRoom(newRoom);
    }

    public void addBedToRoom(int roomNumber, int bedNumber) {
        for (Room room : hostelModel.getRooms()) {
            if (room.getIdentifier() == roomNumber) {
                room.addBed(new Bed(bedNumber));
                return;
            }
        }
        System.out.println("Quarto não encontrado!");
    }
}