package com.github.xenteros.dzien2;

class User {

    /*
        Pola, czyli właściwości klasy.
     */
    String firstName;
    String lastName;

    /*
        Konstruktory są taką strategią, jak stworzyć obiekt. Programista tworząc obiekt,
        decyduje, z którego konstruktora skorzysta.
     */

    User() {

    }
    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
        Metody, to takie funkcjonalności poszczególnych obiektów.
     */

    String getFullName() {
        return firstName + " " + lastName;
    }
}
