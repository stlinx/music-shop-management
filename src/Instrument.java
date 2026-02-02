public class Instrument {

    public enum Status {
        AVAILABLE, RENTED, SOLD
    }

    private String id;
    private String name;
    private String model;
    private InstrumentType type;
    private double price;
    private Status status = Status.AVAILABLE;

    public Instrument(String id, String name, String model,
                      InstrumentType type, double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public void markAsSold() {
        status = Status.SOLD;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
