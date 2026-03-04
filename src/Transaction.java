/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kimoj
 */
import java.time.LocalDate;

public abstract class Transaction {

    protected Instrument instrument;
    protected LocalDate date;

    public Transaction(Instrument instrument) {
        this.instrument = instrument;
        this.date = LocalDate.now();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public LocalDate getDate() {
        return date;
    }

    public abstract void process();  // Abstraction
}
