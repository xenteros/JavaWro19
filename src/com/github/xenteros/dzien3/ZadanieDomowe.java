package com.github.xenteros.dzien3;

import java.util.Scanner;

class ZadanieDomowe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int system = sc.nextInt();

        System.out.println(zadanie2(number, system));

        System.out.println(zadanie3(zadanie2(128, 16)));


    }


    public static String zadanie1(int number, int system) {
        return Integer.toString(number, system);
    }


    public static String zadanie2(int number, int system) {
        return zadanie1(number, system) + "_" + system;
    }

    public static int zadanie3(String numberAndSystem) {
        String[] split = numberAndSystem.split("_");
        String number = split[0];
        int system = Integer.parseInt(split[1]);
        return Integer.parseInt(number, system);
    }
}
