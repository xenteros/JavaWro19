package com.github.xenteros.dzien7;


class Zadanie1 {

    public static void main(String[] args) {
//        pyramid(6);
        reverseString("Kajak");

        average(1.0, 2.0, 3.0);

    }

    public static void pyramid(int rows) {

        for (int i = 0; i < rows; i++) {
            printRow(rows, i);
        }
    }

    public static void printRow(int rows, int i) {
        for (int j = 0; j < rows - j - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * j + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void reverseString(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static double average(double... i) {
        return i[0];
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
