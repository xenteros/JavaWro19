package com.github.xenteros.dzien5;

class Sock extends com.github.xenteros.dzien5.Clothing {

    private String length;


    public Sock(String length, String description, String color, String material, String size) {
        super(description, color, material, size);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Length: " + length);
    }
}
