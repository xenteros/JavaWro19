package com.github.xenteros.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {


    @Test
    public void shouldReturnProperAnimal() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal elephant = animalFactory.create("Elephant");
        Animal lion = animalFactory.create("Lion");
        Animal monkey = animalFactory.create("Monkey");

        assertTrue(Arrays.asList(elephant.getClass().getClasses()).contains(Elephant.class));
        assertTrue(Arrays.asList(lion.getClass().getClasses()).contains(Lion.class));
        assertTrue(Arrays.asList(monkey.getClass().getClasses()).contains(Monkey.class));
    }

}