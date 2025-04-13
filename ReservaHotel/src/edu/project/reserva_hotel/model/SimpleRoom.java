package edu.project.reserva_hotel.model;

public class SimpleRoom implements Room{
    @Override
    public String getDescription() {
        return "Simple room - Garden view";
    }

    @Override
    public double getPrice() {
        return 250;
    }
}
