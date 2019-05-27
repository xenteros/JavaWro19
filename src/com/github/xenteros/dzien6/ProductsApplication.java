package com.github.xenteros.dzien6;

class ProductsApplication {

    public static void main(String[] args) {
        Product coke = new Product("Coke", 3);
        Product mountainGirl = new Product("Góralka", 2);

//        Bill bill = new Bill();
//        bill.addProduct(coke);
//        bill.addProduct(mountainGirl);
//
//        System.out.println(bill.getTotal());

        Bill ordinary = new OrdinaryClientBill();
        ordinary.addProduct(coke);
        ordinary.addProduct(mountainGirl);

        Bill golden = new GoldenClientBill();
        golden.addProduct(coke);
        golden.addProduct(mountainGirl);

        System.out.println(ordinary.getTotal());
        System.out.println(golden.getTotal());

    }
}
