package com.github.xenteros.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class AnimalTest {


    @Test
    public void lionShouldBeAnAnimal() {
        Lion lion = new Lion();
        assertTrue(lion.getClass().getSuperclass().equals(Animal.class));
    }

    @Test
    public void monkeyShouldBeAnAnimal() {
        Monkey monkey = new Monkey();
        assertTrue(monkey.getClass().getSuperclass().equals(Animal.class));
    }

    @Test
    public void elephantShouldBeAnAnimal() {
        Elephant elephant = new Elephant();
        Class<?>[] classes = elephant.getClass().getClasses();
        assertTrue(elephant.getClass().getSuperclass().equals(Animal.class));
    }

}
