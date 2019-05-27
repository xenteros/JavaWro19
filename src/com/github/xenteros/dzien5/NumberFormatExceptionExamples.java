package com.github.xenteros.dzien5;

import java.util.Scanner;

class NumberFormatExceptionExamples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            int userAge = Integer.parseInt(userInput);
            System.out.println(userAge);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Podany wiek jest nieprawidłowy: " + userInput);
        }

        System.out.println("Wykonuję się normalnie");
    }
}