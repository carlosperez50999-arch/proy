package domain;

import java.util.ArrayList;

public class ParkingLot {
    private byte slotsAmtC = 30;
    private byte slotsAmtM = 20;
    private byte spotNum = 0;
    ArrayList<ParkingSpot> spots = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ParkingLot() {
        for (byte i = 0; i < 50; i += 1) {
            if (i <= 29) {
                spots.add(new ParkingSpot("C", true, (byte) (i + 1)));
                vehicles.add(new Vehicle("XXXXXX", false, "C", (byte) (i + 1)));
            } else {
                spots.add(new ParkingSpot("M", true, (byte) (i + 1)));
                vehicles.add(new Vehicle("XXXXXX", false, "M", (byte) (i + 1)));
            }
        }
    }

    public void getAvSpots() {
        for (byte i = 0; i < 50; i += 1) {
            if (spots.get(i).getAvailability()) {
                spots.get(i).spotInfo();
            }
        }
    }

    private boolean hasSpace() {
        for (ParkingSpot s : spots) {
            if (s.getAvailability()) {
                return true;
            }
        }
        return false;
    }

    public void enterVehicle() {
        byte posSlct = 0;
        if (hasSpace()) {
            do {
                posSlct = (byte) ((Math.random()) * 50);
            } while (!spots.get(posSlct).getAvailability());
            spots.get(posSlct).setAvailability(false);
            System.out.println(posSlct + 1);
        } else {
            System.out.println("El parqueadero está lleno");
        }
    }

    public void leaveVehicle() {
        byte posSlct;
        do {
            posSlct = (byte)(Math.random() * 50);
        } while (spots.get(posSlct).getAvailability());
        spots.get(posSlct).setAvailability(true);
        System.out.println((posSlct + 1));
    }
}