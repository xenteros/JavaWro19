package com.github.xenteros.zoo;

import java.util.ArrayList;
import java.util.List;

class Zoo {

    private List<Animal> animals = new ArrayList<>();
    private AnimalFactory animalFactory = new AnimalFactory();

    public Zoo() {
    }

    public void buyAnimal(String name) {
        this.animals.add(animalFactory.create(name));
    }

    public void animalDied(Animal animal) {
        this.animals.remove(animal);
    }

    public void animalBorn(Animal animal) {
        this.animals.add(animal);
    }

    public void letAllAnimalsScream() {
        for (Animal animal : this.animals) {
            System.out.println(animal.makeSomeNoise());
        }
    }

    public void makeAllScream(Class clazz) {
        for (Animal animal : this.animals) {
            if (animal.getClass().equals(clazz)) {
                System.out.println(animal.makeSomeNoise());
            }
        }
        this.animals.stream()
                .filter(a -> a.getClass().equals(clazz))
                .forEach(a -> System.out.println(a.makeSomeNoise()));

    }

    public int getAnimalsSize() {
        return animals.size();
    }

}
