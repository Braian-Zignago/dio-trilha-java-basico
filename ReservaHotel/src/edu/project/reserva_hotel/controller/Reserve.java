package edu.project.reserva_hotel.controller;

import edu.project.reserva_hotel.model.LuxuryRoom;
import edu.project.reserva_hotel.model.SimpleRoom;
import edu.project.reserva_hotel.service.ReserveService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Reserve {
    public static void main(String[] args) {
        ReserveService reserveService = new ReserveService();
        LuxuryRoom luxuryRoom = new LuxuryRoom();
        SimpleRoom simpleRoom = new SimpleRoom();
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dates;
        LocalDate inDate;
        LocalDate outDate;

        reserveService.bookRoom(luxuryRoom, "Braian", LocalDate.now(), LocalDate.now().plusDays(3));
        dates = input.next();
        String[] date = dates.split(",");
        inDate = LocalDate.parse(date[0], formatter);
        outDate = LocalDate.parse(date[1], formatter);
        if (inDate.isBefore(outDate)){
            reserveService.bookRoom(simpleRoom, "Vitoria", inDate, outDate);
        }
        reserveService.listReserves();
    }
}
