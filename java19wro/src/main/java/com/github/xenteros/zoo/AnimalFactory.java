package com.github.xenteros.zoo;

class AnimalFactory {

    public Animal create(String animal) {
        if (animal.equalsIgnoreCase("Elephant")) {
            return null;
        } if (animal.equalsIgnoreCase("Monkey")) {
            return null;
        } if (animal.equalsIgnoreCase("Lion")) {
            return null;
        } else {
            return null;
        }
    }
}
