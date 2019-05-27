package com.github.xenteros.dzien6;

import java.util.ArrayList;
import java.util.List;

class Bill {

    private List<Product> products;

    public Bill() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotal() {


        return 0;
    }


}
