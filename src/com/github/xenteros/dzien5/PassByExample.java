package com.github.xenteros.dzien5;

class PassByExample {

    public static void main(String[] args) {
        Dog dog = new Dog("Szarik");
        printDogName(dog);
        burkify(dog);
        printDogName(dog);
        reksiofy(dog);
        printDogName(dog);


    }

    public static void printDogName(Dog dog) {
        System.out.println(dog.getName());
    }

    public static void burkify(Dog dog) {
        dog.setName("Burek");
    }

    public static void reksiofy(Dog dog) {
        dog = new Dog("Reksio");
    }
}
