package com.github.xenteros.dzien4;

class ClothingApplication {

    public static void main(String[] args) {
        Clothing clothing1 = new Clothing(
                "Bolerko, czyli nie do końca wiadomo co...",
                "Czerwony",
                "Wełna/Poliester",
                "M");
        clothing1.display();

        Sock sock = new Sock(
                "Long",
                "Skarpetki sportowe Asics, trójpak",
                "Czarny",
                "Bawełna",
                "39-42");
        sock.display();
    }
}
