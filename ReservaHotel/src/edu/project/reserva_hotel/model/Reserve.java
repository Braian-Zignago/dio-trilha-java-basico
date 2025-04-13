package edu.project.reserva_hotel.model;
import java.time.LocalDate;
public class Reserve {
    private Room room;
    private String client;
    private LocalDate inDate;
    private LocalDate outDate;

    public Reserve(Room room, String client, LocalDate inDate, LocalDate outDate) {
        this.room = room;
        this.client = client;
        this.inDate = inDate;
        this.outDate = outDate;
    }

    public Room getRoom() {
        return room;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getInDate() {
        return inDate;
    }

    public LocalDate getOutDate() {
        return outDate;
    }
}
