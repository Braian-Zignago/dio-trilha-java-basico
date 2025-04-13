package edu.project.reserva_hotel.model;

public class LuxuryRoom implements Room{
    @Override
    public String getDescription() {
        return "Luxury room - Sea view.";
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
