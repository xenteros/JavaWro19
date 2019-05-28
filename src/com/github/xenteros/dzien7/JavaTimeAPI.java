package com.github.xenteros.dzien7;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

class JavaTimeAPI {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, Month.DECEMBER, 20);
        Period timeBetweenNowAndMyBirthsday = Period.between(birthday, now);
        long between = ChronoUnit.DAYS.between(birthday, now);
        System.out.println(between);
    }
}
