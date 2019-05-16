package com.github.xenteros.dzien2;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        // TODO: 16.05.2019 Zamienić liczby ze stringów na inty lub double
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        // TODO: 16.05.2019 Sprawdzić co to za operator, +-* czy / i wyświetlić odpowiedni wynik

        if (operator.equals("+")) {
            System.out.println(a+b);
        } else if (operator.equals("-")) {
            System.out.println(a-b);
        } else if (operator.equals("*")) {
            System.out.println(a*b);
        } else if (operator.equals("/")) {
            System.out.println(a/b);
        } else {
            System.out.println("Nie znam tego operatora.");
        }


    }
}
