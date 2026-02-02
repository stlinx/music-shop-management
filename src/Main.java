public class Main {
    public static void main(String[] args) {

        Owner owner = new Owner("Admin");
        MusicShop shop = new MusicShop("My Music Shop");

        owner.login();

        InstrumentType guitarType = new InstrumentType("Guitar");
        Instrument guitar = new Instrument(
                "G001",
                "Acoustic Guitar",
                "FG800",
                guitarType,
                7500
        );

        shop.addInstrument(guitar);

        SaleTransaction sale = new SaleTransaction(guitar, 7500);
        shop.addSaleTransaction(sale);

        sale.processSale();

        Report report = new Report(shop);
        report.generateSalesReport();
    }
}
