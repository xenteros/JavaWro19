package com.github.xenteros.dzien6;

class UpperCaseHelloWorld implements HelloWorld {

    @Override
    public String getGreeting() {
        return "HELLO WORLD";
    }

    @Override
    public String getGreeting(String name) {
        return "HELLO " + name.toUpperCase();
    }
}
