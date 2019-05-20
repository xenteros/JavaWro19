package com.github.xenteros.dzien3;

class Methods {

    public static void main(String[] args) {
        Methods.displayHelloName("Adam");
        double result = Methods.rectangleArea(3,5);
        System.out.println(result);
    }

    public static double rectangleArea(double a, double b){
        return a*b;
    }

    public static void displayHelloName(String name) {
        System.out.println("Hello " + name);
    }

    public static int squareArea(double a) {
        return Double.valueOf(a*a).intValue();
    }

}
