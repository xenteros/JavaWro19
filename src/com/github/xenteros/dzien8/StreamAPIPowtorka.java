package com.github.xenteros.dzien8;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

class StreamAPIPowtorka {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ala");
        sb.append("ma");
        sb.append("kota");
        String result = sb.toString();
    }

    private void zadanie1(List<String> names) {

        names.stream()
                .filter(name -> name.length() <= 4)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

    private void zadanie2(List<String> names) {
        names.stream()
                .filter(name -> name.startsWith("B"))
                .distinct()
                .collect(toList());
    }

    private void zadanie3(List<String> names) {
        names.stream()
                .map(name -> name.substring(0, 3))
                .distinct()
                .map(String::toUpperCase)
                .collect(toList());
    }

    private void zadanie4(List<String> names) {
        names.stream()
                .sorted(comparingInt(String::length).reversed())
                .limit(10)
                .collect(toList());
    }

    private void zadanie5(List<String> names) {
        List<String> collect = names.stream()
                .distinct()
                .sorted(comparingInt(String::length).thenComparing(name -> name.substring(name.length() - 1)))
                .limit(5)
                .sorted(comparingInt(String::length).reversed().thenComparing(name -> name.substring(name.length() - 1)))
                .collect(toList());

        for (String s : collect) {
            System.out.println(s);
        }
    }

    private void zadanie6(List<String> names) {
        names.stream()
                .filter(name -> name.substring(0, 3).toUpperCase().contains("A"))
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());
    }
}