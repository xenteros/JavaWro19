package com.github.xenteros.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    @Test
    @DisplayName("Dla FizzBuzz(10) zwracane sa dwa fizzbuzz.")
    void whenCallingFizzBuzzWith10_Then2FizzBuzzesAreReturned() {

        Loops loops = new Loops();

        List<String> fizzBuzz = loops.fizzBuzz(10);
        int counter = 0;

        for (String buzz : fizzBuzz) {
            if (buzz.equals("fizzbuzz")) {
                counter++;
            }
        }

        assertEquals(2, counter);
    }

    @Test
    @DisplayName("Nie jest zwracany null")
    void whenCallingFizzBuzzWithANegative_ThenEmptyListIsReturned() {
        Loops loops = new Loops();
        assertNotNull(loops.fizzBuzz(-1));
    }

    @Test
    @DisplayName("Są zwracane poprawne wartości")
    void whenCallingFizzBuzzWith100_ThenCorrectValuesAreReturned() {
        Loops loops = new Loops();
        List<String> strings = loops.fizzBuzz(100);

        assertEquals("Fizz", strings.get(33));
        assertEquals("Fizz", strings.get(36));
        assertEquals("Fizz", strings.get(39));
        assertEquals("Fizz", strings.get(42));
        assertEquals("Buzz", strings.get(35));
        assertEquals("Buzz", strings.get(40));
        assertEquals("fizzbuzz", strings.get(30));
        assertEquals("fizzbuzz", strings.get(45));

    }
}