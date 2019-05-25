package com.github.xenteros.dzien5;

import com.github.xenteros.dzien5.Sock;
import com.github.xenteros.dzien5.Tshirt;
import com.github.xenteros.dzien5.Clothing;


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
        Clothing[] clothes = new Clothing[]{null, sock, tshirt};
        printClothes(clothes);

    }





    public static void printClothes(Clothing[] clothes) {
        for (Clothing cloth : clothes) {
            if (cloth != null) {
                System.out.println(cloth.getClass());
                cloth.display();
                System.out.println();
            }
        }
    }
}
