package com.github.xenteros;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

class Application {

    public static void main(String[] args) {
        String test = "abc";

        System.out.println(StringUtils.leftPad(test, 5));
        String test2 = " .";
        System.out.println(StringUtils.defaultIfBlank(test2, test));
        List<String> stringList = Arrays.asList("Ala", "ma", "kota");
        System.out.println(StringUtils.join(stringList, ";"));
    }
}
