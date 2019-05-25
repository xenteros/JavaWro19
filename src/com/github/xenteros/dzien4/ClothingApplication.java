package com.github.xenteros.dzien4;

class ClothingApplication {

    public static void main(String[] args) {
//        Clothing clothing1 = new Clothing(
//                "Bolerko, czyli nie do końca wiadomo co...",
//                "Czerwony",
//                "Wełna/Poliester",
//                "M");
//        clothing1.display();

        Sock sock = new Sock(
                "Long",
                "Skarpetki sportowe Asics, trójpak",
                "Czarny",
                "Bawełna",
                "39-42");
//        sock.display();

        Tshirt tshirt = new Tshirt(
                "Nerdowski tshirt z konferencji",
                "Czarny",
                "Bawełna",
                "XL",
                "166"
        );
//        tshirt.display();

        Clothing c1 = null;
        Clothing c2 = sock;
        c1 = c2;
        Clothing c3 = tshirt;

        Clothing[] clothes = new Clothing[] {c1, c2, c3};

        for (Clothing cloth : clothes) {
            System.out.println(cloth.getClass());
            cloth.display();
            System.out.println();
        }

//        if (c2 instanceof Sock) {
//            Sock s = (Sock)c2;
//            System.out.println(s.getLength());
//        }






    }
}
