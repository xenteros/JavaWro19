package com.github.xenteros.dzien2;

class Homework {

    public static void main(String[] args) {
        String[] myStrings = new String[]{"Ala", "ma", "kota", "a", "sierotka", "ma", "Rysia"};
//        myStrings = "Ala ma kota a sierotka ma rysia".split(" ");
//        zadanie5(myStrings);
        zadanie9(myStrings);
    }

    public static void zadanie5(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.startsWith("a") || str.startsWith("A")) {
//            if (str.toLowerCase().startsWith("a")) {
                System.out.println(str);
            }
        }
    }

    public static void zadanie6(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str.length() >= 5) {
                System.out.println(str);
            }
        }
    }

    public static void zadanie7(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].toUpperCase());
        }
    }

    public static void zadanie9(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            printMiddleLetterOfAString(strings[i]);
        }
    }

    public static void printMiddleLetterOfAString(String str) {
        int strLength = str.length();
        int middleIndex;
        if (strLength % 2 == 0) {
            middleIndex = strLength / 2 - 1;
        } else {
            middleIndex = strLength / 2;
        }
        System.out.println(str.charAt(middleIndex));
    }



}
