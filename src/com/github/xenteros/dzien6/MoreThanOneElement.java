package com.github.xenteros.dzien6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class MoreThanOneElement {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("Ala");
        list.add("ma");
        list.add("kota");
        list.add("a");
        list.add("sierotka");
        list.add("ma");
        list.add("rysia");
        System.out.println(list);
        System.out.println(list.toArray());

        String[][] arrays = new String[3][];
        arrays[0] = new String[]{"a", "b", "c"};
        arrays[1] = new String[]{"D", "E", "F", "G"};
        arrays[2] = new String[] {"1", "2"};

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.deepToString(arrays));
        System.out.println(Arrays.toString(arrays));


    }
}
