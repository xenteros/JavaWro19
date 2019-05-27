package com.github.xenteros.dzien6;

class Interfejsy {

    public static void main(String[] args) {

        System.out.println(HelloWorld.message);

        HelloWorld lower = new LowerCaseHelloWorld();
        HelloWorld upper = new UpperCaseHelloWorld();
        HelloWorld exclamation = new HelloWorld() {
            @Override
            public String getGreeting() {
                return "Hello World!";
            }

            @Override
            public String getGreeting(String name) {
                return String.format("Hello, %s!", name);
            }
        };

        HelloWorld[] helloWorlds = new HelloWorld[]{lower, upper, exclamation};
        for (HelloWorld helloWorld : helloWorlds) {
            System.out.println(helloWorld.getGreeting());
            System.out.println(helloWorld.getGreeting("Adam"));
        }

    }
}
