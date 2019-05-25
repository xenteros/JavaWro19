package com.github.xenteros.dzien4;

public class Tshirt extends Clothing {

    private String height;


    public Tshirt(String description, String color, String material, String size, String height) {
        super(description, color, material, size);
        this.height = height;

    }

    public String getHeight() {
        return height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Width: " + getHeight());
    }
}