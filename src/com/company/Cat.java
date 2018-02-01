package com.company;
import java.util.Scanner;

public class Cat {
    private int legs;
    private boolean fur;
    private String color;

    public Cat(int legs, boolean fur, String color) {
        Scanner scanner = new Scanner(System.in);
        this.legs = legs;
        this.fur = fur;
        System.out.println("What color would you like your cat?");
        setColor(scanner.nextLine());
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
