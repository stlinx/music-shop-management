import java.util.ArrayList;
import java.util.List;

public class MusicShop {

    private String shopName;
    private List<Instrument> instruments = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<InventoryLog> logs = new ArrayList<>();

    public MusicShop(String shopName) {
        this.shopName = shopName;
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
        logs.add(new InventoryLog(instrument, "ADD"));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        transaction.process();  // polymorph
        logs.add(new InventoryLog(transaction.getInstrument(),
                transaction.getClass().getSimpleName()));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public String getShopName() {
        return shopName;
    }
}