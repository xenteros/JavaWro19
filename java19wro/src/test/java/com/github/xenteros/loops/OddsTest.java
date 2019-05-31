package com.github.xenteros.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddsTest {

    @Test
    void shouldThrowExceptionForNonPositiveN() {
        Odds odds = new Odds();

        assertThrows(IllegalArgumentException.class, () -> odds.nthOdd(null, -1));
        assertThrows(IllegalArgumentException.class, () -> odds.nthOdd(null, 0));
    }

    @Test
    void shouldReturnMinus1ForArrayOfEnens() {
        Odds odds = new Odds();

        assertEquals(-1, odds.nthOdd(new int[]{2,4,6,8}, 1));
    }

    @Test
    void shouldReturnCorrectValueForArrays() {
        Odds odds = new Odds();

        assertEquals(2, odds.nthOdd(new int[]{1,2,3,4}, 1));
        assertEquals(4, odds.nthOdd(new int[]{1,2,3,4}, 2));
        assertEquals(4, odds.nthOdd(new int[]{11,1,2,3,4}, 1));
        assertEquals(-1, odds.nthOdd(new int[]{10,1,2,3,4}, 10));
    }

}