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
        Class<?>[] classes = elephant.getClass().getClasses();

        assertTrue(elephant instanceof Elephant);
        assertTrue(lion instanceof Lion);
        assertTrue(monkey instanceof Monkey);
    }

}