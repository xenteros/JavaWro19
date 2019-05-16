package com.github.xenteros.dzien2;

import java.util.Scanner;

class Test {

    public static void main(String[] args) {
//        User user = new User("Jan", "Nowak");
//        System.out.println(user.getFullName());

//        if (warunek) {
//            instrukcje do wykonania, gdy warunek jest prawdziwy
//        } else {
//            instrukcje w przeciwnym przypadku
//        }

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.endsWith("a")) {
            System.out.println("Hello, m'dame");
        } else {
            System.out.println("Hello, sir");
        }


    }
}
