package com.github.xenteros.loops;

import java.util.ArrayList;
import java.util.List;

class Loops {


    /**
     * Napisz metodę, która zwróci listę i napisów. Zwracaj:
     * Fizz dla liczb podzielnych przez 3,
     * Buzz dla liczb podzielnych przez 5,
     * fizzbuzz dla liczb podzielnych przez 3 i przez 5
     * Konkretną liczbę dla liczb niespełniających powyższych warunków.
     * <p>
     * Przykład:
     * fizzbuzz
     * 1
     * 2
     * Fizz
     * 4
     * Buzz
     *
     * @param i
     */
    public List<String> fizzBuzz(int i) {

        List<String> result = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            if (j % 15 == 0) {
                result.add("fizzbuzz");
            } else if (j % 3 == 0) {
                result.add("Fizz");
            } else if (j % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(j));
            }
        }

        result.forEach(System.out::println);

        return result;
    }


    /**
     * Napisz metodę, która przyjmuje jako argument dwa napisy, następnie porównuje je litera, po literze i zwraca informację, na ilu pozycjach, oba te napisy mają identyczne litery.
     *
     * @param a
     * @param b
     */
    public int sameLetters(String a, String b) {
        int counter = 0;

        if (a.length() != b.length()) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }


    /**
     * Napisz metodę, która zwróci Listę tablic. W tablicy w i-tym wierszu, ma się znaleźć i liczb i.
     * <p>
     * []
     * [1]
     * [2,2]
     * [3,3,3]
     * [4,4,4,4]
     *
     * @param n
     * @return
     */
    public List<int[]> triangle(int n) {

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] row = new int[i];

            for (int j = 0; j < i; j++) {
                row[j] = i;
            }

            result.add(row);
        }
        return result;
    }


}
