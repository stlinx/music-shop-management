import java.time.LocalDateTime;

public class InventoryLog {

    private Instrument instrument;
    private String action;
    private LocalDateTime timestamp;

    public InventoryLog(Instrument instrument,
                        String action) {
        this.instrument = instrument;
        this.action = action;
        this.timestamp = LocalDateTime.now();
    }
}