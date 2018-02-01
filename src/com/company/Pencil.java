package com.company;

public class Pencil {

    private double leadSize;
    private String brand;
    boolean hasEraser;
    private String color;
    boolean isMechanical;



    public double getLeadSize() {
        return leadSize;
    }

    public void setLeadSize(double leadSize) {
        this.leadSize = leadSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasEraser() {
        return hasEraser;
    }

    public void setHasEraser(boolean hasEraser) {
        this.hasEraser = hasEraser;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }
}
