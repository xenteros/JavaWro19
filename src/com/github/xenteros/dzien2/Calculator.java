package com.github.xenteros.dzien2;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj operator:");
            String operator = scanner.nextLine();
            System.out.println("Podaj pierwszą liczbę:");
            String firstNumber = scanner.nextLine();
            System.out.println("Podaj drugą liczbę:");
            String secondNumber = scanner.nextLine();

            // TODO: 16.05.2019 Zamienić liczby ze stringów na inty lub double
            int a = Integer.parseInt(firstNumber);
            int b = Integer.parseInt(secondNumber);
            // TODO: 16.05.2019 Sprawdzić co to za operator, +-* czy / i wyświetlić odpowiedni wynik

            if (operator.equals("+")) {
                System.out.println(a + b);
            } else if (operator.equals("-")) {
                System.out.println(a - b);
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);
            } else {
                System.exit(0);
            }
        }
    }
}
