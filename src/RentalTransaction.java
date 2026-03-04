public class RentalTransaction extends Transaction {

    private int rentalDays;
    private double pricePerDay;

    public RentalTransaction(Instrument instrument,
                             int rentalDays,
                             double pricePerDay) {
        super(instrument);
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public void process() {
        instrument.markAsRented();
        System.out.println("Rented: " +
                instrument.getName() +
                " total = " + calculateTotal());
    }

    public double calculateTotal() {
        return rentalDays * pricePerDay;
    }
}