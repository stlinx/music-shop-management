public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner("Admin");
        owner.login();

        MusicShop shop = new MusicShop("My Music Shop");

        InstrumentType guitarType = new InstrumentType("Guitar");

        Instrument guitar = new Instrument(
                "I001",
                "Acoustic Guitar",
                "FG800",
                guitarType,
                7500
        );

        shop.addInstrument(guitar);

        Transaction sale = new SaleTransaction(guitar, 7500);
        shop.addTransaction(sale);

        Report report = new Report(shop);
        report.generateSalesReport();
    }
}