package domain;

public class Ticket {
    private float value = 0;
    private boolean status;
    private Vehicle vehicle;

    public int getValue(String type) {
        if (vehicle.getType().equals("M")) {
            return 3000;
        } else {
            return 5000;
        }
    }
}