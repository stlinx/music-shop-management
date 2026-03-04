public class Report {

    private MusicShop shop;

    public Report(MusicShop shop) {
        this.shop = shop;
    }

    public void generateSalesReport() {

        double total = 0;

        for (Transaction t : shop.getTransactions()) {

            if (t instanceof SaleTransaction) {
                SaleTransaction sale =
                        (SaleTransaction) t;

                total += sale.getPrice();
            }
        }

        System.out.println("Total Sales: " + total);
    }
}