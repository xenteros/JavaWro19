package com.github.xenteros.dzien8;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

class StreamAPI {

    public static void main(String[] args) {
        List<String> names = StringCollections.names();

        zadanie5(names);

//        List<String> namesOfLenght3 = names.stream()
//                .filter(name -> name.length() == 3)
//                .distinct()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toList());
//
//        for (String s : namesOfLenght3) {
//            System.out.println(s);
//        }
    }

    /*
        Wyświetl trzy pierwsze litery wszystkich imion, małymi literami, alfabetycznie
     */
    public static void zadanie1(Collection<String> names) {
        List<String> collect = names.stream()
                .map(name -> name.substring(0, Math.min(4, name.length())))
                .map(name -> name.toLowerCase())
                .sorted(comparingInt(s1 -> s1.length()))
                .collect(Collectors.toList());

        for (String s : collect) {
            System.out.println(s);
        }
    }

    public static void zadanie4(Collection<String> names) {
        names.stream()
                .map(StreamAPI::reverse)
                .sorted(comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    public static void zadanie5(Collection<String> names) {
        names.stream()
                .sorted(comparingInt(String::length).thenComparing(name -> name.substring(name.length() - 1)))
                .forEach(System.out::println);
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
