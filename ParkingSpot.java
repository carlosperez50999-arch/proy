package domain;

public class ParkingSpot {
    private String type;
    private boolean availability;
    private byte number;

    public ParkingSpot(String type, boolean availability, byte number) {
        this.type = type;
        this.availability = availability;
        this.number = number;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void setAvailability (boolean av) {
        availability = av;
    }

    public void spotInfo(){
        System.out.println(type + " " + availability + " " + number);
    }
}