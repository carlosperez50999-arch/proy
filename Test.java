package ui;

import domain.ParkingLot;

public class Test {
    public static void main(String[] args) {
        ParkingLot test = new ParkingLot();

        test.getAvSpots();
        test.enterVehicle();
        test.enterVehicle();
        test.getAvSpots();
        test.leaveVehicle();
        test.getAvSpots();
    }
}