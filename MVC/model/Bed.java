package MVC.model;

public class Bed {
    private int number;
    private boolean isOccupied;

    public Bed(int number) {
        this.number = number;
        this.isOccupied = false;
    }

    public void make() {
        System.out.println("Arrumando cama " + number);
        this.isOccupied = false;
    }

    public void occupy() {
        this.isOccupied = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}