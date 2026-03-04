public class PracticeRoom {

    private String roomName;
    private double pricePerHour;
    private boolean available;

    public PracticeRoom(String roomName,
                        double pricePerHour) {
        this.roomName = roomName;
        this.pricePerHour = pricePerHour;
        this.available = true;
    }

    public void occupy() {
        available = false;
    }

    public void free() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}