package edu.project.iphone.controller;

import edu.project.iphone.service.Iphone;

public class IphoneControll {
    private final Iphone cell;

    public IphoneControll(long imei, String color, String model) {
        this.cell = new Iphone(imei, color, model);
    }

    public void execute(){
        cell.reproduce();
        cell.printPage("www.google.com");
    }
}
