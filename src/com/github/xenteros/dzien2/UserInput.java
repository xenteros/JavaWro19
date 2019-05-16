package com.github.xenteros.dzien2;

import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Dear User, introduce yourself.");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);

//        int i = scanner.nextInt();
//        double d = scanner.nextDouble();

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();
        System.out.println(firstNumber+secondNumber);
        /**
         * Integer to klasa pomocnicza do pracowania z intami. Może też przechowywać liczbę
         * całkowitą. To taka foremka, która i pierniczka zrobi i za lusterko posłuży.
         */
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        System.out.println(a+b);

        double d = Double.parseDouble(firstNumber);


    }

}


