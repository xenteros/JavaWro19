package com.github.xenteros.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {


    @Test
    public void shouldIncreaseTheNumberOfAnimals() {
        Zoo zoo = new Zoo();

        int animalsSize = zoo.getAnimalsSize();

        zoo.buyAnimal("Monkey");

        assertEquals(animalsSize + 1, zoo.getAnimalsSize());
    }


}
