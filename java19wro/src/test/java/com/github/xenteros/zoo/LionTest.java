package com.github.xenteros.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class AnimalTest {


    @Test
    public void lionShouldBeAnAnimal() {
        Lion lion = new Lion();
        assertTrue(Arrays.asList(lion.getClass().getClasses()).contains(Animal.class));
    }

    @Test
    public void monkeyShouldBeAnAnimal() {
        Monkey monkey = new Monkey();
        assertTrue(Arrays.asList(monkey.getClass().getClasses()).contains(Monkey.class));
    }

    @Test
    public void elephantShouldBeAnAnimal() {
        Elephant elephant = new Elephant();
        assertTrue(Arrays.asList(elephant.getClass().getClasses()).contains(Animal.class));
    }

}
