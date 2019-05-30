package com.github.xenteros.dzien9;

class Main {

    public static void main(String[] args) {
        CustomStringBuilder csb = new CustomStringBuilder();
        csb.append("ma");
        csb.insert("Ala", 0);
        csb.append("kota");
        System.out.println(csb.toString());
    }
}
