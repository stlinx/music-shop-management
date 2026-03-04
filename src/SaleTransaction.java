public class SaleTransaction extends Transaction {

    private double price;

    public SaleTransaction(Instrument instrument, double price) {
        super(instrument);
        this.price = price;
    }

    @Override
    public void process() {
        instrument.markAsSold();
        System.out.println("Sold: " +
                instrument.getName() +
                " for " + price);
    }

    public double getPrice() {
        return price;
    }
}