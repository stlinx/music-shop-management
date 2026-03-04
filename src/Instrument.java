public class Instrument {

    public enum Status {
        AVAILABLE, RENTED, SOLD
    }

    private String id;
    private String name;
    private String model;
    private InstrumentType type;
    private double price;
    private Status status;

    public Instrument(String id, String name,
                      String model,
                      InstrumentType type,
                      double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.type = type;
        this.price = price;
        this.status = Status.AVAILABLE;
    }

    public void markAsSold() {
        if (status == Status.AVAILABLE) {
            status = Status.SOLD;
        }
    }

    public void markAsRented() {
        if (status == Status.AVAILABLE) {
            status = Status.RENTED;
        }
    }

    public void markAsAvailable() {
        status = Status.AVAILABLE;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}