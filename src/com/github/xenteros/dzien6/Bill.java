package com.github.xenteros.dzien6;

import java.util.ArrayList;
import java.util.List;

abstract class Bill {

    private List<Product> products;

    public Bill() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice();
        }

        return total*(1 - getDiscount());
    }

    public abstract double getDiscount();

}
