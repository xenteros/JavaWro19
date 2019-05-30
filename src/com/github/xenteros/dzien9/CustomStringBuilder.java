package com.github.xenteros.dzien9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class CustomStringBuilder {

    private List<String> appenders;

    public CustomStringBuilder() {
        appenders = new ArrayList<>();
    }

    public void append(String s) {
        appenders.add(s);
    }

    @Override
    public String toString() {
        return appenders.stream()
                .collect(Collectors.joining(""));
//        return String.join("", appenders);
    }

    /**
     *
     * @param s
     * @param i miejsce, na które ma być wklejony napis s
     */
    public void insert(String s, int i) {
        appenders.add(i, s);
    }
}
