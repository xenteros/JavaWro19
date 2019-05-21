package com.github.xenteros.dzien4;

public class Dog extends Animal {

    private String name;

    public Dog(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Hau hau hau!");
    }

    @Override
    public String toString() {
//        return "Dog with " + getLegCount() + " legs and name: " + this.name;
        return String.format("Dog with %d legs and name: %s", getLegCount(), this.name);
    }
}
