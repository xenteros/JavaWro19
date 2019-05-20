package com.github.xenteros.dzien3;

class PrimitivesAndWrappers {

    public static void main(String[] args) {
        String number = "10";

        int parsed = Integer.parseInt(number);
        System.out.println(parsed+parsed);
        parsed = Integer.parseInt(number, 2);
        System.out.println(parsed+parsed);
        parsed = Integer.parseInt(number, 16);
        System.out.println(parsed+parsed);

        int minInt = Integer.MIN_VALUE;


        int tenPrimitive = 10;
//        Integer tenInteger = Integer.valueOf(10);
        Integer tenInteger = 10;        //autoboxing
        int i = tenInteger;             //unboxing

        if (tenPrimitive == 10) {

        }

        if (tenInteger.equals(10)) {

        }



    }
}
