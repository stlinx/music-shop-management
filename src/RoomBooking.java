import java.time.LocalDateTime;

public class RoomBooking {

    private PracticeRoom room;
    private LocalDateTime start;
    private LocalDateTime end;

    public RoomBooking(PracticeRoom room,
                       LocalDateTime start,
                       LocalDateTime end) {
        this.room = room;
        this.start = start;
        this.end = end;
    }
}