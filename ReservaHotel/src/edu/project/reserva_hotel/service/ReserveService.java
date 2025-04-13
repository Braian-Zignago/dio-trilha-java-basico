package edu.project.reserva_hotel.service;

import edu.project.reserva_hotel.model.Reserve;
import edu.project.reserva_hotel.model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReserveService {
    private List<Reserve> reserves = new ArrayList<>();

    public void bookRoom(Room room, String client, LocalDate inDate, LocalDate outDate) {
        Reserve reserve = new Reserve(room, client, inDate, outDate);
        reserves.add(reserve);
        System.out.println("Reservation made successfully for " + client);
    }

    public void cancelReserve(String client) {
        reserves.removeIf(reserve -> reserve.getClient().equals(client));
        System.out.println("Reservaton undo successfully for " + client);
    }

    public void listReserves() {
        for (Reserve reserve : reserves) {
            System.out.println("Client: " + reserve.getClient() +
                    ". Room: " + reserve.getRoom().getDescription() +
                    "Date in use: " + reserve.getInDate() + " -- " + reserve.getOutDate());
        }
    }
}
