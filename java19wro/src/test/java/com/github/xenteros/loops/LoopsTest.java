package com.github.xenteros.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    @Test
    @DisplayName("Dla FizzBuzz(30) zwracane sa dwa fizzbuzz.")
    void whenCallingFizzBuzzWith30_Then2FizzBuzzesAreReturned() {

        Loops loops = new Loops();

        List<String> fizzBuzz = loops.fizzBuzz(30);
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

    @Test
    @DisplayName("Dla dwóch napisów o różnej długości leci wyjątek")
    void whenCallingSameLettersWithDifferentSizeArguments_ThenIllegalArgumentExceptionIsThrown() {
        Loops loops = new Loops();

        assertThrows(IllegalArgumentException.class, () -> loops.sameLetters("a", "bcd"));
        assertThrows(IllegalArgumentException.class, () -> loops.sameLetters("bcd", "a"));
    }

    @Test
    @DisplayName("Dla takich samych napisów zwraca ich długość.")
    void whenCallingSameLettersWithTwoEqualArguments_ThenTheirLengthIsReturned() {
        Loops loops = new Loops();

        String[] words = new String[]{"Ala", "Ma", "Kota", "", "aabb", "Aa"};

        for (String word : words) {
            assertEquals(word.length(), loops.sameLetters(word, word));
        }

    }

    @Test
    @DisplayName("Dla argumentów tej samej długości, zwracany jest poprawny wynik")
    void whenCallingSameLettersWithEqualLengthArguments_ThenReturningCorrectValue() {
        Loops loops = new Loops();

        String[] as = new String[]{"Abcd", "aaaa", "abAb"};
        String[] bs = new String[]{"AacA", "bbbb", "ABab"};
        int[] results = new int[]{2, 0, 1};

        for (int i = 0; i < 3; i++) {
            assertEquals(results[i], loops.sameLetters(as[i], bs[i]));
        }

    }

    @Test
    @DisplayName("Dla ujemnej liczby rzędów zwraca 0 rzędów")
    void whenCallingTriangleWithNegative_Then0RowsAreReturned() {
        Loops loops = new Loops();
        for (int i = -100; i < 0; i++) {
            assertEquals(0, loops.triangle(i).size());
        }
    }

    @Test
    @DisplayName("Dla dodatnich działa dobrze")
    void whenCallingTriangleWithPositiveNumber_ThenAppropriateTriangleIsReturned() {
        Loops loops = new Loops();

        List<int[]> triangle = loops.triangle(10);

        for (int i = 0; i < triangle.size(); i++) {
            int[] ints = triangle.get(i);
            for (int j : ints) {
                assertEquals(i, ints[j]);
            }
        }

    }

}