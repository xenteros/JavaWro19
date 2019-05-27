package com.github.xenteros.dzien6;

class LowerCaseHelloWorld implements HelloWorld {

    @Override
    public String getGreeting() {
        return "hello world";
    }

    @Override
    public String getGreeting(String name) {
        return "hello " + name.toLowerCase();
    }
}
