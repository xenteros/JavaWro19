package com.github.xenteros.ifs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {


    @Test
    void shouldThrowExceptionForNegatives() {
        LeapYear leapYear = new LeapYear();

        assertThrows(IllegalArgumentException.class, () -> leapYear.isLeapYear(-1));
    }

    @Test
    void shouldReturnTrue() {
        LeapYear leapYear = new LeapYear();
        int[] years = new int[]{20, 1996, 2004, 2008};

        for (int year : years) {
            assertTrue(leapYear.isLeapYear(year));
        }
    }

    @Test
    void shouldReturnFalse() {
        LeapYear leapYear = new LeapYear();
        int[] years = new int[]{21, 22, 23, 1999, 2001, 2003};

        for (int year : years) {
            assertFalse(leapYear.isLeapYear(year));
        }
    }

    @Test
    void shouldReturnFalseSpecialCase() {
        LeapYear leapYear = new LeapYear();
        int[] years = new int[]{1900, 1700, 1800, 2300};

        for (int year : years) {
            assertFalse(leapYear.isLeapYear(year));
        }
    }

    @Test
    void shouldReturnTrueSpecialCase() {
        LeapYear leapYear = new LeapYear();
        int[] years = new int[]{2000, 1600, 2400, 800};

        for (int year : years) {
            assertTrue(leapYear.isLeapYear(year));
        }
    }

}