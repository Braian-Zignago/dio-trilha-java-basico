package edu.project.iphone.model;

public abstract class CellPhone {
    private String model;
    private String color;
    private final long IMEI;

    public CellPhone(long IMEI, String color, String model) {
        this.IMEI = IMEI;
        this.color = color;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public long getIMEI() {
        return IMEI;
    }
}
