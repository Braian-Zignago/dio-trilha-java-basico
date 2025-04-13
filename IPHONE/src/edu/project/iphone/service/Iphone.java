package edu.project.iphone.service;

import edu.project.iphone.model.CellPhone;
import edu.project.iphone.model.InternetBrowser;
import edu.project.iphone.model.MusicPlayer;
import edu.project.iphone.model.TelephoneDevice;

public class Iphone extends CellPhone implements InternetBrowser, MusicPlayer, TelephoneDevice {

    public Iphone(long IMEI, String color, String model) {
        super(IMEI, color, model);
    }

    public void reproduce() {
        System.out.println("Playing music...");
    }

    @Override
    public void puase() {
        System.out.println("Pause music...");
    }

    public void selectMusic(String music) {
        System.out.println("Playing " + music + "......");

    }

    @Override
    public void printPage(String url) {
        System.out.println("Print page: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab add...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page Refresh...");

    }

    @Override
    public void call(long number) {
        System.out.println("Calling to: " + number);
    }

    @Override
    public void pickUp(){
        System.out.println("Pickup call...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Start voice mail...");

    }
}
