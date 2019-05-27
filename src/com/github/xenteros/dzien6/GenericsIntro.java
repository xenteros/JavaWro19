package com.github.xenteros.dzien6;

class GenericsIntro {

    public static void main(String[] args) {
        CardboardBox<String> stringBox = new CardboardBox<>("Cat");
        stringBox.getContent().toLowerCase();

        CardboardBox<Product> presentBox = new CardboardBox<>(null);
        presentBox.getContent();

        Product ring = new Product("Ring", 999);
        CardboardBox<Product> ringBox = new CardboardBox<>(ring);
        System.out.println(ringBox.getContent());
    }
}
