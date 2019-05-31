package com.github.xenteros.loops;

class Odds {


    /**
     * Napisz metodę, która zwraca entą liczbę nieparzystą z tablicy ints.
     *
     * np. nthOdd([1,2,3,4],1) znaczy zwróć pierwszą liczbę nieparzystą
     *
     * Jeżeli takiej liczby nie ma, to zwróć -1
     *
     * @param n
     */
    public int nthOdd(int[] ints, int n) {

        int alreadyFound = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                alreadyFound++;
            }
            if (alreadyFound == n) {
                return ints[i];
            }
        }


        return -1;
    }
}
