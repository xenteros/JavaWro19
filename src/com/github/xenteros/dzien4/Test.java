package com.github.xenteros.dzien4;

class Test {

    public static void main(String[] args) {
        Animal dog = new Animal(4);
        dog.makeSomeNoise();
        System.out.println(dog.getLegCount());
        System.out.println(dog.toString());

        System.out.println();

        Dog d = new Dog("Burek");
        d.makeSomeNoise();
        System.out.println(d.getLegCount());
        System.out.println(d.toString());

    }
}
