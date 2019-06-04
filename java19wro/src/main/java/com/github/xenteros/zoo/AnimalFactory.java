package com.github.xenteros.zoo;

class AnimalFactory {

    public Animal create(String animal) {
        if (animal.equalsIgnoreCase("Elephant")) {
            return new Elephant();
        }
        if (animal.equalsIgnoreCase("Monkey")) {
            return new Monkey();
        }
        if (animal.equalsIgnoreCase("Lion")) {
            return new Lion();
        }
        else {
            return null;
        }
    }
}
