import java.util.ArrayList;
import java.util.List;

public class MusicShop {

    private String shopName;
    private List<Instrument> instruments = new ArrayList<>();
    private List<SaleTransaction> saleTransactions = new ArrayList<>();
    private List<RentalTransaction> rentalTransactions = new ArrayList<>();
    private List<PracticeRoom> practiceRooms = new ArrayList<>();
    private List<RoomBooking> roomBookings = new ArrayList<>();
    private List<InventoryLog> logs = new ArrayList<>();

    public MusicShop(String shopName) {
        this.shopName = shopName;
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
        logs.add(new InventoryLog(instrument, "ADD"));
    }

    public void addSaleTransaction(SaleTransaction sale) {
        saleTransactions.add(sale);
        logs.add(new InventoryLog(sale.getInstrument(), "SOLD"));
    }

    public List<SaleTransaction> getSaleTransactions() {
        return saleTransactions;
    }
}
