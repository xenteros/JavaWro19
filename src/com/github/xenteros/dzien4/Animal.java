package com.github.xenteros.dzien4;

public class Animal {

    private int legCount;

    public Animal(int legCount) {
        this.legCount = legCount;
    }

    public Animal() {
        this.legCount = 4;
    }

    public void makeSomeNoise() {
        System.out.println("I'm just a general Animal.");
    }

    public int getLegCount() {
        return legCount;
    }

    @Override
    public String toString() {
        return "Animal with " + legCount + " legs.";
    }
}
